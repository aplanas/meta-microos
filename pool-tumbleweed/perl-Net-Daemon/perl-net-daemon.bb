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

RPM_NAME = "perl-Net-Daemon-0.49-1.14.noarch.rpm"
RPM_HASH = "c2758edf640f107830f28d9f779e3ba17181e92f0c348b7d733c6fc79b187245f7fb934c830f030dd9ce76a7682f9007b336828a6f1e87f3a975cf7ff14cb75d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Daemon \
perl-Net--Daemon--Log \
perl-Net--Daemon--Test \
perl-Net--Daemon--Test--Fork \
perl-Net--Daemon--Test--Win32 \
perl-Net-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sys--Syslog"

inherit rpm
