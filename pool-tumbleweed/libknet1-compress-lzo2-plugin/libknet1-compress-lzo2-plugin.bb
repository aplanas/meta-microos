SUMMARY = "Provides libknet1 lzo2 support"
DESCRIPTION = "Provides lzo2 compression support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-lzo2-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "c72346dc34ab0aabedf5b1af483ebd5b56655f54a15521973c33cf1a9cc46d5111c6e8502be95113eb336de9d4859813eaf287afd46e13d006356ad6f703771b"

RPROVIDES:${PN} += "libknet1-compress-lzo2-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
liblzo2.so.2"

inherit rpm
