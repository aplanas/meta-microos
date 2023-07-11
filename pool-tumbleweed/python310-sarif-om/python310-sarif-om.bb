SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-sarif-om-1.0.4-2.3.noarch.rpm"
RPM_HASH = "5a1eea5780f5ec54f8041648ab23b5d52923a3a130f4b5eb9908a18afe58370a8855cf386480ac6d63ba7abc5f8eab8b5677c1f5c61b9ea862dec6cf644bc28f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sarif-om \
python310-sarif-om \
python3dist-sarif-om"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-pbr"

inherit rpm
