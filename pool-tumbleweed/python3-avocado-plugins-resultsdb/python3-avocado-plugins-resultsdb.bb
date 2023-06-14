SUMMARY = "Avocado plugin to propagate job results to ResultsDB"
DESCRIPTION = "Allows Avocado to send job results directly to a ResultsDB \
server."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-resultsdb-69.0-6.10.noarch.rpm"
RPM_HASH = "3ce26607ca82935f9859242e4b3aa5302fe5fa9b8552a07f72829c954e7d8c2da7a9dacccf4587f13fe99afcb8af351c1c1f8f26062a5b39bfccfa723069a2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-resultsdb \
python3.10dist-avocado-framework-plugin-resultsdb \
python3dist-avocado-framework-plugin-resultsdb"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-resultsdb-api"

inherit rpm
