SUMMARY = "Yet Another JSON Library (Development Environment)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for compiling and linking \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-2.1.0-8.1.aarch64.rpm"
RPM_HASH = "3ab12ffb00b5f1796dde706cc04a425ba952d88e88f4ec2b274e20309fb89e3b47473c4fdb3fc5e0b79467d616f847015dc80155fd15947fddb1a98b8445407f"

RPROVIDES:${PN} += "libyajl-devel \
pkgconfig-yajl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyajl2"

inherit rpm
