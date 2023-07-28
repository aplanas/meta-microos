SUMMARY = "Graphical User Interface for Open Babel, a chemical toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains a graphical interface for Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-gui-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "ce643f3415f6cdc6b1de3486a17dbd39df07972a39c5d428dd1ddb68aefa3ee98c96fe217948ad64d0570ac44d56d7f52f0af2394e6eaf6d32271173ce607062"

RPROVIDES:${PN} += "openbabel-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenbabel.so.7 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
