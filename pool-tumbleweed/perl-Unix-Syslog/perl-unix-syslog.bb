SUMMARY = "Perl interface to the UNIX syslog(3) calls"
DESCRIPTION = "This module provides an interface to the system logger syslogd(8) via \
Perl's XSUBs. The implementation attempts to resemble the native libc- \
functions of your system, so that anyone being familiar with syslog.h \
should be able to use this module right away. \
 \
Authors: \
-------- \
    Marcus Harnisch <marcus.harnisch@gmx.net>"
LICENSE = "Artistic-1.0"

PV = "1.1"

RPM_NAME = "perl-Unix-Syslog-1.1-20.39.aarch64.rpm"
RPM_HASH = "6d47cac4b6f2e8eeb1a144329e7f328ed690c1b992219751769b6a9cac6007804a651e083178c6ad652d5715d142829fc8dd44b1312934077539b71c35766c98"

RPROVIDES:${PN} += "perl-Unix--Syslog \
perl-Unix-Syslog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
