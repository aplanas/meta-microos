SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
Ice theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Ice-Icons-20220219.1.26-1.10.noarch.rpm"
RPM_HASH = "64d0d62fc1e58333a3a117d15c8cca886ce48c021573b9d81aaf9f199facdf1c6bc8fe6064d2619bf6f6451bf80faa6e5853595dbdf6a6c882bb0cca5706519c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Ice-Icons"
RDEPENDS:${PN} += ""

inherit rpm
