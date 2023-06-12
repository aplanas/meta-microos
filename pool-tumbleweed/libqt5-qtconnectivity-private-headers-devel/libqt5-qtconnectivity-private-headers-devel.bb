SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtsensors that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtconnectivity-private-headers-devel-5.15.9+kde5-1.1.noarch.rpm"
RPM_HASH = "fc30d4f92df5b09599ca7d087024dbd882c62937e8a1e60c2a75710daf47d735508fabad6b8edfc9a40516a4c2269ccd72318da7b6a397347d01f7d1a39fb200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtconnectivity-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtconnectivity-devel \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm
