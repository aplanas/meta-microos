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

RPM_NAME = "perl-Unix-Syslog-1.1-20.38.aarch64.rpm"
RPM_HASH = "7147b821c224037c5e3bafc39ad2d4dfeb2ad968c0422b2f208878c84b917ca3d015b3891ef69b6d233e586ed136b3d9c6bdaf4ae5f612d6c2a3fe85340cead2"

RPROVIDES:${PN} += "perl-Unix--Syslog \
perl-Unix-Syslog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
