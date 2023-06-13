SUMMARY = "Perl extension for portable daemons"
DESCRIPTION = "Net::Daemon is an abstract base class for implementing portable server \
applications in a very simple way. The module is designed for Perl 5.005 \
and threads, but can work with fork() and Perl 5.004. \
 \
The Net::Daemon class offers methods for the most common tasks a daemon \
needs: Starting up, logging, accepting clients, authorization, restricting \
its own environment for security and doing the true work. You only have to \
override those methods that aren't appropriate for you, but typically \
inheriting will safe you a lot of work anyways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.49"

RPM_NAME = "perl-Net-Daemon-0.49-1.12.noarch.rpm"
RPM_HASH = "4dbb8163750185c22db1cca4fcb69f5b950d5d9dc984197d70291c54a0d72ee756713fec78f815d77e580e5546de978c50d53099c061e98e25986bfcd0ea86c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Daemon) \
perl(Net::Daemon::Log) \
perl(Net::Daemon::Test) \
perl(Net::Daemon::Test::Fork) \
perl(Net::Daemon::Test::Win32) \
perl-Net-Daemon"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Sys::Syslog)"

inherit rpm
