SUMMARY = "CSS2 Parser Library"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model-like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-0_6-3-0.6.13-5.4.aarch64.rpm"
RPM_HASH = "c6ff9946cef4d5c1d22693d81ff8bd8421d3c286a3f93b1c5ce78852805e0d06f3bd857e3a2655660cd796028c49638e75cbc18acf90732b1d11ff3b44b1c546"

RPROVIDES:${PN} += "libcroco-0-6-3 \
libcroco-0.6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libxml2.so.2"

inherit rpm
