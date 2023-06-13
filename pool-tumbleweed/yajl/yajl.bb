SUMMARY = "Yet Another JSON Library Tools"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides a few command-line utilities for processing JSON files."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "yajl-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "83b687b232f7472bb1f040028c9a910ba82def021527abe674bfeb81a4a7cb14c8f2d54bd1062205bd5e5e2bd9c3087872d8204c468e2630683ff42883d11a03"

RPROVIDES:${PN} += "yajl \
yajl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libyajl2"

inherit rpm
