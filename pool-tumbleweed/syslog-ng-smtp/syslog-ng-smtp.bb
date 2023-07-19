SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-smtp-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "4b415171f1d2203d3366876b56915b0f719fd958441946bffb7c77f8d3478f83a086e8e005975c0fab8c90869a01db5602c24e090d09db1e0b69116ad521c592"

RPROVIDES:${PN} += "syslog-ng-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libesmtp.so.6.2.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
