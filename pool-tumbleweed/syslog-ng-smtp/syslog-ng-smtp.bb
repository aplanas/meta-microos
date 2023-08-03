SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-smtp-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "d34b61d38e93f514fdceff731b1783eb8e25f51c472b074f929524bd5cb1c7938f7ca00d69c6f5c29c14d81550170f64e1bcc9b2d2d0d985ebbadb6a7f2c7a2b"

RPROVIDES:${PN} += "syslog-ng-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libesmtp.so.6.2.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
