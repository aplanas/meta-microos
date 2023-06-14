SUMMARY = "Qt-based text editor with image viewer"
DESCRIPTION = "TEA is a Qt-based text editor. It supports reading FB2, ODT, RTF, \
DOCX, Abiword, KWord KWD and SWX documents, though only writes out \
plaintext. Image viewing is possible as well. It has a built-in \
Midnight-Commander-style file manager, integrates spell checking \
(aspell/hunspell), and syntax highlighting for a number of languages."
LICENSE = "GPL-3.0-or-later"

PV = "61.2.0"

RPM_NAME = "tea-61.2.0-1.3.aarch64.rpm"
RPM_HASH = "95bd7d32ff8eed174cdf94966043fd59180f9f43f0c98c650d6d0e062a134fa88ab661a77e0d27604951c4c564babf78531b5f67c73010c33580ceccb5040051"

RPROVIDES:${PN} += "tea"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
