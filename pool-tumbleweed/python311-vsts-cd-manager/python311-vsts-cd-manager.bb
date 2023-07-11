SUMMARY = "Python wrapper around some of the VSTS APIs"
DESCRIPTION = "Python wrapper around some of the VSTS APIs"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-vsts-cd-manager-1.0.2-4.6.noarch.rpm"
RPM_HASH = "e6ed87dc566f7beb8df1aa880c79a764b53d12ddba94ff19c10738fffba48ba92e5c0d89fe7b2e27a913b9c7d4a2aae943c69c9aadcdc275eef1c8f7417dac72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vsts-cd-manager \
python3.11dist-vsts-cd-manager \
python311-vsts-cd-manager \
python3dist-vsts-cd-manager"

RDEPENDS:${PN} += "python-abi \
python311-msrest"

inherit rpm
