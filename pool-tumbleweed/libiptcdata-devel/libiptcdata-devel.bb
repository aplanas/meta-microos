SUMMARY = "Development files for the IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving IPTC \
(International Press Telecommunications Council) data. stored within \
multimedia files such as images. \
 \
This subpackage contains the header files for the library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-devel-1.0.5-1.10.aarch64.rpm"
RPM_HASH = "d53f7fa8fd39736ebd8870e4cc6938ac7d2b03a33ff5841d543cb71686945d618ae69943abae2200cd905499781431fa3c8f58d33f0812a39a07bc0dbb2b49e2"

RPROVIDES:${PN} += "libiptcdata-devel \
libiptcdata-devel(aarch-64) \
pkgconfig(libiptcdata)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiptcdata"

inherit rpm
