SUMMARY = "CSS2 Parser Library"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model-like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-0_6-3-0.6.13-5.3.aarch64.rpm"
RPM_HASH = "27f2920aa6c48f3dd2820792629d3808787997a3c97527899cec9320111dce7e9b659cea50a07627ed979a3b8d2b776da6796ca2ac4cfb3921040d62fd6760c0"

RPROVIDES:${PN} += "libcroco-0.6.so.3()(64bit) \
libcroco-0_6-3 \
libcroco-0_6-3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
