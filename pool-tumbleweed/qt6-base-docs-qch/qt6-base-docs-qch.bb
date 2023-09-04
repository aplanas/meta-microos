SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-base-docs-qch-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d8792618e41976f908af8b2035e8729c0634e7700f710cdd29b70d141c38b9bc88dbd83cae5d849771e449d68afe1051ce7368ea78f582a9224d6e66d9794712"

RPROVIDES:${PN} += "qt6-base-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
