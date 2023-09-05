SUMMARY = "Documentation for Spectacle"
DESCRIPTION = "This package contains the documentation available for Spectacle, which is a \
screenshot capture program by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "spectacle-doc-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "073f3a29a7a96c4863391dd91cf8e70f7ddfdc638b70a301e9b40cbb93684e4afbbe0d7c580d4401dd61f0fdc067bd2b4e7557b2c0310bd1b5987c1eab4ca55d"

RPROVIDES:${PN} += "spectacle-doc"

RDEPENDS:${PN} += "spectacle"

inherit rpm
