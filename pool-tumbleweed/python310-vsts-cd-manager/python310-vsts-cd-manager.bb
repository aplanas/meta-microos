SUMMARY = "Python wrapper around some of the VSTS APIs"
DESCRIPTION = "Python wrapper around some of the VSTS APIs"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-vsts-cd-manager-1.0.2-4.4.noarch.rpm"
RPM_HASH = "d3542b10265bc28965b9713d5f36d019df2216c234bf06f9b0b59ffbb68dfd8210951b6d18cdf1fee8183dd0ab39a7d75ad541955d14291b5a51119af3f3558f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vsts-cd-manager \
python3.10dist-vsts-cd-manager \
python310-vsts-cd-manager \
python3dist-vsts-cd-manager"

RDEPENDS:${PN} += "python-abi \
python310-msrest"

inherit rpm
