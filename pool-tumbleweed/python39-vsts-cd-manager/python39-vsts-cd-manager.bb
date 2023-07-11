SUMMARY = "Python wrapper around some of the VSTS APIs"
DESCRIPTION = "Python wrapper around some of the VSTS APIs"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-vsts-cd-manager-1.0.2-4.6.noarch.rpm"
RPM_HASH = "af11855bcf7774862dc16de01833a079d375b7cd0f6c903e2be7fc7c6beb45bbb031e7ec84c001b3715bad9fbdea20390cf8736c0c10f6e05f12f2703129b3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vsts-cd-manager \
python39-vsts-cd-manager \
python3dist-vsts-cd-manager"

RDEPENDS:${PN} += "python-abi \
python39-msrest"

inherit rpm
