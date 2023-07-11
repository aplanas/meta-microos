SUMMARY = "Python wrapper around the VSTS APIs"
DESCRIPTION = "Python wrapper around the VSTS APIs"
LICENSE = "MIT"

PV = "0.1.25"

RPM_NAME = "python310-vsts-0.1.25-2.16.noarch.rpm"
RPM_HASH = "e1e8f97d9c21a9a1080686975c2b2830507629c9479db5513c6539292a51c32b89b1294bbf1dab835c9ebbccc7d327d6c27468adb7f89c89adf13b57303e9fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vsts \
python310-vsts \
python3dist-vsts"

RDEPENDS:${PN} += "python-abi \
python310-msrest"

inherit rpm
