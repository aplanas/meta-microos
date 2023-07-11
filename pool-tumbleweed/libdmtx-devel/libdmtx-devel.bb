SUMMARY = "Software for reading and writing Data Matrix barcodes"
DESCRIPTION = "libdmtx is open source software for reading and writing Data Matrix barcodes. \
At its core libdmtx is a native shared library, allowing C/C++ programs to use \
its capabilities without extra restrictions or overhead."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "libdmtx-devel-0.7.7-1.5.aarch64.rpm"
RPM_HASH = "e6ce66fb03defe8edd517f17a3cf82b3c0dc240c55965082847971716769f0bbcd7ac2dcf449d8e591d7c7030f5bec1b68bd3b71b44c8980b2060a4fc0a19f7a"

RPROVIDES:${PN} += "libdmtx-devel \
pkgconfig-libdmtx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmtx0"

inherit rpm
