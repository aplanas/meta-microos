SUMMARY = "Documentation for gnubg"
DESCRIPTION = "Manual for GNU Backgammon. See description of gnubg for more details."
LICENSE = "GFDL-1.3-only"

PV = "1.06.002"

RPM_NAME = "gnubg-doc-1.06.002-3.5.noarch.rpm"
RPM_HASH = "fbecbfbd0cfbb8d7904d218dc78f3e860d60243d889f15a692dce433dec487ee824e4827dfe1f6935b26e07645067f43129f1ede720680cbf064d8022b731518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-doc"

RDEPENDS:${PN} += ""

inherit rpm
