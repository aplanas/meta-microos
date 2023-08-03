SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-curl-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "0e2860b58ee04bc41d01c78b8eb4a06891e526f8a428efc682e2e7183a631997fbb2e06208f060de9de47a36ff9b3b07c7cae4cf86c612aa6ece4d8916519dc8"

RPROVIDES:${PN} += "syslog-ng-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
