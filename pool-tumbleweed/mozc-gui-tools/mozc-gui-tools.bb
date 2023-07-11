SUMMARY = "GUI tools for mozc"
DESCRIPTION = "This package provides config, word-register, dictioaly, \
character-palette tools."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "mozc-gui-tools-2.29.5111.102-1.1.aarch64.rpm"
RPM_HASH = "1793dada54dc6c26c65b961dd269391a27ff403050b776f1066a2b82023bcd372fb9a5c6d18f781f82c1b58b566e1e3c7f35302a152284057086e9c3baf4d208"

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
