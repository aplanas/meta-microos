SUMMARY = "Provides libknet1 lzma support"
DESCRIPTION = "Provides lzma compression support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-lzma-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "c29ea932cb9fa5df102a66148e234f7c8dd8acfb60eff9934fd000f430ef57ea4cf6bd1d43f09f1e20cc62117273f4d999d1ccb02438a4ad5743493008a3a236"

RPROVIDES:${PN} += "libknet1-compress-lzma-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
liblzma.so.5"

inherit rpm
