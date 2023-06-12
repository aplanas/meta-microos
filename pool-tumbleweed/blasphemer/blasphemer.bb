SUMMARY = "Replacement game files for Heretic game engines"
DESCRIPTION = "Blasphemer aims to create a free content package for the Heretic engine, \
with a theme of metal-inspired dark fantasy."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "blasphemer-0.1.8-1.1.noarch.rpm"
RPM_HASH = "2cc59c2204ec701db5386ceff61e5775fbc6d95379713ab48026c0c2cd4af268c97477f3daa87df0afa3c0bf2bac51f33b79f7d9d5dd8be25cda5fe18eeb697d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blasphemer"
RDEPENDS:${PN} += ""

inherit rpm
