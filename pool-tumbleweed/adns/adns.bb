SUMMARY = "Advanced Easy-to-Use Asynchronous-Capable DNS Utilities"
DESCRIPTION = "adns includes a collection of useful DNS resolver utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "adns-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "049da6819a05a3a8a37ac4327dfda6dca0e24065c5b05c4b7d5d80afccacffadf29d41fbd3f5131a8152b2fc71bb7aa06b370a9d87f06b9b47c648e42dd485cb"

RPROVIDES:${PN} += "adns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadns.so.1 \
libc.so.6"

inherit rpm
