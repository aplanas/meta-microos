SUMMARY = "CSS2 Parser Library"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model-like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-0.6.13-5.4.aarch64.rpm"
RPM_HASH = "70e5de1a66489219dbd06b0e1eb36453b37f2f8fe3926b67774f9baaa727afe24ee4a7e131f7859d9603fd8cf67409a3df89fbbfe99a527f5f9382b75b524179"

RPROVIDES:${PN} += "libcroco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcroco-0.6.so.3 \
libglib-2.0.so.0 \
libxml2.so.2"

inherit rpm
