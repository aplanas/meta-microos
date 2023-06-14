SUMMARY = "Python wrapper around the VSTS APIs"
DESCRIPTION = "Python wrapper around the VSTS APIs"
LICENSE = "MIT"

PV = "0.1.25"

RPM_NAME = "python310-vsts-0.1.25-2.14.noarch.rpm"
RPM_HASH = "7578a35d244df42bd3191afe5957d7904cb17536d3391a5f3171002965c85e8596a64488cd004b18691d0f15cbea59c039c90418b356d50e6580d0590497277a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vsts \
python3.10dist-vsts \
python310-vsts \
python3dist-vsts"

RDEPENDS:${PN} += "python-abi \
python310-msrest"

inherit rpm
