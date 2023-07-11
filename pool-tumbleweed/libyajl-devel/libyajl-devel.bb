SUMMARY = "Yet Another JSON Library (Development Environment)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for compiling and linking \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-2.1.0-7.2.aarch64.rpm"
RPM_HASH = "d1e2ef735104aaf25c74006f2f2cef3e538d23b62e53a72a8063bd46a5e48a82bca7115e25d6a2c5dbc6cdf31242c1957e81d2e2b93baeeab58c77a23cd159b8"

RPROVIDES:${PN} += "libyajl-devel \
pkgconfig-yajl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyajl2"

inherit rpm
