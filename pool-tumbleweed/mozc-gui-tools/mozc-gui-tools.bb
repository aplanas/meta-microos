SUMMARY = "GUI tools for mozc"
DESCRIPTION = "This package provides config, word-register, dictioaly, \
character-palette tools."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "mozc-gui-tools-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "3eb27884f75d4878dbca07473414f0807f0bf46a9b59464063a6fab55a5deed54b290872aff302dc57d1d94cea3ca47e216df90dfe4d6b6ca635dd4fbdbf2221"

RPROVIDES:${PN} += "mozc-gui-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
mozc"

inherit rpm
