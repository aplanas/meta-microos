SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-smtp-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "b1db8ddc5f168f52db7755819797cbf30ee9726173247febfad6d33148f267f0f68b31430eaf71f4028667de3e8e65c6096e7ebd1838a1c863540a8d937ed7af"

RPROVIDES:${PN} += "syslog-ng-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libesmtp.so.6.2.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
