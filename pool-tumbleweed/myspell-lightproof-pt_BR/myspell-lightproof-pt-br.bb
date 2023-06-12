SUMMARY = "Lightproof for pt_BR"
DESCRIPTION = "Lightproof grammar checker information for pt_BR."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lightproof-pt_BR-20221012-1.2.aarch64.rpm"
RPM_HASH = "1c4d94fe499c967e2ff753a3b09657c8b96742e76891fdb1963dea16fcfd2be7efa61232658910a36caa99b0e8e5d1cd90db512209f5c7baa9d36325b965ac40"

RPROVIDES:${PN} += "myspell-lightproof-pt_BR \
myspell-lightproof-pt_BR(aarch-64)"
RDEPENDS:${PN} += "myspell-pt_BR"

inherit rpm
