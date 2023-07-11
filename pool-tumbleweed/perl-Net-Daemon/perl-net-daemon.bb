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

RPM_NAME = "perl-Net-Daemon-0.49-1.13.noarch.rpm"
RPM_HASH = "0a3fa2fff54e3cdf8027fbfe575e5b1cbae42b6c166718278842c8d50c153f6ff2a98fb68a3753647c179955f08b8c1e8dae37d0700a29664e886ecfebdd6eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Daemon \
perl-Net--Daemon--Log \
perl-Net--Daemon--Test \
perl-Net--Daemon--Test--Fork \
perl-Net--Daemon--Test--Win32 \
perl-Net-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Sys--Syslog"

inherit rpm
