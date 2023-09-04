SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-smtp-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "268a41a404f0abf939e53614a57f37e0e8f59720875e6c449c33d706597908b047d5c77238aa8ab2b69cd05ab0d5e70aac7f4767bad8c9b7055ae61bc4061545"

RPROVIDES:${PN} += "syslog-ng-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libesmtp.so.6.2.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
