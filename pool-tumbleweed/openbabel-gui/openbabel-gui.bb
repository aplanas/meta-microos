SUMMARY = "Graphical User Interface for Open Babel, a chemical toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains a graphical interface for Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-gui-3.1.1-1.4.aarch64.rpm"
RPM_HASH = "cc940093714e2b388b1aeb9d5513a7936b097c237c5051cb5530b8101c92b8cd0d06f589fb0472b2b8434294c18feb6553bb9b1f93de03da8ee969e4dadd1b72"

RPROVIDES:${PN} += "openbabel-gui \
openbabel-gui(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopenbabel.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit)"

inherit rpm
