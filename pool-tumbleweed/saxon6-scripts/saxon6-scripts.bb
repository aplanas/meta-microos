SUMMARY = "Utility scripts for saxon6"
DESCRIPTION = "Utility scripts for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-scripts-6.5.5-16.7.noarch.rpm"
RPM_HASH = "0427a4718f8d9f88dd86bf347d1a2dfaba860e51a37da056f6dd0b50633ee5dd4de1a6b2e2ea6a71d38f586bd14b5291f0cce631c78194344c62669eff77b490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon-scripts \
saxon6-scripts"

RDEPENDS:${PN} += "saxon6"

inherit rpm
