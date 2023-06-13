SUMMARY = "CSS2 Parser Library"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model-like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-0.6.13-5.3.aarch64.rpm"
RPM_HASH = "86acc8bd8e0564a4aa1bf8ed9b8be1162fcf60db2c5fd29169759808ba8799fb8cbf6d8b235436cf1b6e290ff1f0cec8df0b6978d345ca3ff17dc1356734ded6"

RPROVIDES:${PN} += "libcroco \
libcroco(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcroco-0.6.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
