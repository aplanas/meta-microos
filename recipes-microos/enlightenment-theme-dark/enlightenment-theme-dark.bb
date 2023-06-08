SUMMARY = "The old default theme for enlightenment"
DESCRIPTION = "The old default theme for enlightenment, for most of the 2010 Era."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220216.1.26"

RPM_NAME = "enlightenment-theme-dark-20220216.1.26-1.10.noarch.rpm"
RPM_HASH = "71bb70d6912a7688ed534913105ee5c768373692f5fa384e76c483399c482f5c51e816f6e0f166512d4e24be62e1ba2eb4c58aa287a658b920af75593344bb45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme enlightenment-theme-dark"
RDEPENDS:${PN} += ""

inherit rpm
