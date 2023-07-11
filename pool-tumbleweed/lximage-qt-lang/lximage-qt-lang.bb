SUMMARY = "Translations for package lximage-qt"
DESCRIPTION = "Provides translations for the 'lximage-qt' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lximage-qt-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "eafd70e50e0b1f23ee171bc6a1eaa5909d21fc8765cbbd7971105efeeddefdcdf5fe7e30c6b2ef4a9927ec9287bf1d4762de45f76e518aaa0f4601ac9396a560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lximage-qt-lang \
lximage-qt-lang-all"

RDEPENDS:${PN} += "lximage-qt"

inherit rpm
