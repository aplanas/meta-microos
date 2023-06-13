SUMMARY = "Documentation for the libwpg API"
DESCRIPTION = "This package contains documentation for the libwpg API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-devel-doc-0.3.4-2.1.noarch.rpm"
RPM_HASH = "0ac4cbfdcae0d0642c3143b993acaa20d9d98b8b87b7581b9f15de2f0ed66aa157203e1425add9146520dad2ac843f21cdd99676136f57e048718ddc699be747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwpg-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
