SUMMARY = "GUI tools for mozc"
DESCRIPTION = "This package provides config, word-register, dictioaly, \
character-palette tools."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "mozc-gui-tools-2.29.5111.102-2.1.aarch64.rpm"
RPM_HASH = "c3e48ebbe1eb08dcbc362a2b583a8da958bbaa553174170797c79154729e5579bb08431a9fc5aabfb6959cbb350f93e15703ba719641a34f8648392a69ad36aa"

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
