SUMMARY = "Development files for yambar"
DESCRIPTION = "Modules for interacting and modifying yambar."
LICENSE = "MIT"

PV = "1.9.0+g34"

RPM_NAME = "yambar-devel-1.9.0+g34-1.3.noarch.rpm"
RPM_HASH = "9e373c3cefe71b457e7e0024f8a73b9338bf6c31b2c45604e706d0a0088e1d1481ade4707fa6378d48c1d8804c770eea3c67e1ec871794d2c3f459bb168899cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yambar-devel"

RDEPENDS:${PN} += "yambar"

inherit rpm
