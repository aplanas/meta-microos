SUMMARY = "Non-ABI stable API for the Qt 6 TextToSpeech library"
DESCRIPTION = "This package provides private headers of libQt6TextToSpeech that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-texttospeech-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "77340e7983f4a1bfa1a5f037a85ff7a3509107746725acf12ab57487b2e203f8565d2f117937908137c668de0c8ef491b552102417d7c9a0968326114c36d3c6"

RPROVIDES:${PN} += "qt6-texttospeech-private-devel"

RDEPENDS:${PN} += "cmake-Qt6TextToSpeech \
qt6-core-private-devel"

inherit rpm
