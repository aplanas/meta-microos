SUMMARY = "Non-ABI stable API for the Qt 6 TextToSpeech library"
DESCRIPTION = "This package provides private headers of libQt6TextToSpeech that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9b073abcd3d0f65c1b6bda320065a04a341210e57608ae090ae12d17fe7a12571337efd4e5cb85d8a564cd9b66232ef968fcdfc31bca26ae6f63c59d61cc447c"

RPROVIDES:${PN} += "qt6-texttospeech-private-devel"

RDEPENDS:${PN} += "cmake-Qt6TextToSpeech \
qt6-core-private-devel"

inherit rpm
