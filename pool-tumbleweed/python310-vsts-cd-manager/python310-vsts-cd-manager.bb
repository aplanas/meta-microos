SUMMARY = "Python wrapper around some of the VSTS APIs"
DESCRIPTION = "Python wrapper around some of the VSTS APIs"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-vsts-cd-manager-1.0.2-4.6.noarch.rpm"
RPM_HASH = "98b3c4a2590549f1e0b3d392f50b645a0a1666b4b10f12cc727d34326218aba83f57dd1e9b4d23efd767319732cb5de539e2311099edd0e43261ce7f0e611a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vsts-cd-manager \
python310-vsts-cd-manager \
python3dist-vsts-cd-manager"

RDEPENDS:${PN} += "python-abi \
python310-msrest"

inherit rpm
