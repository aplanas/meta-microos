SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-smtp-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "6a6ac93b95939b1d57dda6b54878b05f53d4270c4a29784097dc03feb68dc93bfd0e1ef8f870b575b605ab1cbf770d323277d6e2e29e5a6ea8f05f53db44e577"

RPROVIDES:${PN} += "syslog-ng-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libesmtp.so.6.2.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
