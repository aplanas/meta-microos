SUMMARY = "Graphical User Interface for Open Babel, a chemical toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains a graphical interface for Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-gui-3.1.1-1.5.aarch64.rpm"
RPM_HASH = "aa02ce9f13e27a52933061248347bcc7480139d33eee1d30af12757d5fdbf90d43b5c48a6e7c152c7a4ead0cfedc7cfa27a8327f7916223bd304c2ec1cc18e68"

RPROVIDES:${PN} += "openbabel-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenbabel.so.7 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
