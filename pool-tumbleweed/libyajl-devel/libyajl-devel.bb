SUMMARY = "Yet Another JSON Library (Development Environment)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for compiling and linking \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "c66c6c41661933de0bf1abb29338d9b80c0340aab4c72bb3a736bf804219aa0ade64f61ae6a2449fa9b95286f9327a7dc933117fd18e9ab7b3729dbef49db229"

RPROVIDES:${PN} += "libyajl-devel \
pkgconfig-yajl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyajl2"

inherit rpm
