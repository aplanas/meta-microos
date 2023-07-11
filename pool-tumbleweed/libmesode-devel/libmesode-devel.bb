SUMMARY = "Development files for libmesode, an XMPP library"
DESCRIPTION = "Mesode is a collection of libraries for speaking the XMPP protocol. \
 \
This package contains the development files and headers for libmesode."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.10.1"

RPM_NAME = "libmesode-devel-0.10.1-1.12.aarch64.rpm"
RPM_HASH = "4ef9d5b89582ebce0c44d384990d3983bf7d60f4b1ed5c050f55387109bfbca231cbdaa06afaf01e33e3cc0a2fbd072415a0e997cb62c4682c1a13c7350f2346"

RPROVIDES:${PN} += "libmesode-devel \
pkgconfig-libmesode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmesode0 \
pkgconfig-expat \
pkgconfig-openssl"

inherit rpm
