SUMMARY = "Python wrapper around the VSTS APIs"
DESCRIPTION = "Python wrapper around the VSTS APIs"
LICENSE = "MIT"

PV = "0.1.25"

RPM_NAME = "python311-vsts-0.1.25-2.16.noarch.rpm"
RPM_HASH = "0287d3c11f0b85135b1f953f38c7db4acedf153c1e1c57bcba3d3ede2ea46f117a29afd7dbfdba20d71760ae7d49a9f9ec857fd93b30853fb73daa7af84138d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vsts \
python3.11dist-vsts \
python311-vsts \
python3dist-vsts"

RDEPENDS:${PN} += "python-abi \
python311-msrest"

inherit rpm
