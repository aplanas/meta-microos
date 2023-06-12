SUMMARY = "Documentation for garcon"
DESCRIPTION = "This package includes the documentation for garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.18.1"

RPM_NAME = "libgarcon-doc-4.18.1-2.1.noarch.rpm"
RPM_HASH = "0b9006462f776d311b1ea1af9c719abf55c71b07f069a1af54caa78190897f30d6af4b3fea6fb24e53d0ca882bf8674a7b44a6af90303007c215424ccaf5f8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgarcon-doc"
RDEPENDS:${PN} += ""

inherit rpm
