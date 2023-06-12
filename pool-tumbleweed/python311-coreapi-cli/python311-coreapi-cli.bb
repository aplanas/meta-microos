SUMMARY = "An interactive command line client for Core API"
DESCRIPTION = "An interactive command line client for Core API."
LICENSE = "BSD-2-Clause"

PV = "1.0.9"

RPM_NAME = "python311-coreapi-cli-1.0.9-1.22.noarch.rpm"
RPM_HASH = "1fd6d57ab79ed0a06d9c6730c4c0541a950c8aaee4e696d459954470e9ff0a3f5a6b477b6d260ec70a2e72f524eef7267e436874fc316fd89e4dc77f6a50aa47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(coreapi-cli) \
python311-coreapi-cli \
python3dist(coreapi-cli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
python311-coreapi \
python311-coreschema \
python311-itypes \
python311-requests \
python311-uritemplate \
update-alternatives"

inherit rpm
