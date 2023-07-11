SUMMARY = "Development files for Open Babel"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-devel-3.1.1-1.5.aarch64.rpm"
RPM_HASH = "49c2edbfd4a7549c709c72059aef32ae58ad54de5967f626e2d202b1ee8b9f0c69f6e3569d7eacb5613424e35914add72e8d7374ab576527d6b794e4b57550aa"

RPROVIDES:${PN} += "cmake-OpenBabel3 \
libopenbabel-devel \
openbabel-devel \
pkgconfig-openbabel-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenbabel7 \
pkgconfig-zlib"

inherit rpm
