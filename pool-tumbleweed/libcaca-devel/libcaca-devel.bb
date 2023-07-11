SUMMARY = "Library for Colour ASCII Art, text mode graphics"
DESCRIPTION = "This package contains the header files and static libraries needed to \
compile applications or shared objects that use libcaca."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca-devel-0.99.beta20-1.5.aarch64.rpm"
RPM_HASH = "fda4653b9c790f185da73139761e889ce97d739882bfc382c830fc671d07392e8886ea1ab2df1797c3a23ded0b8fa3eea18c6aa15cca8e73fe4b4d1c97455d66"

RPROVIDES:${PN} += "libcaca-devel \
pkgconfig-caca \
pkgconfig-caca++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcaca \
libcaca0-plugins"

inherit rpm
