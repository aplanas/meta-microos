SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.6.7"

RPM_NAME = "python310-texttable-1.6.7-1.3.noarch.rpm"
RPM_HASH = "4efc6e55280800f9f4ca41eb7ee53e470cc3a43f685a8dc591ce3f817d29d0a23f7d1d77475798a98d2a8bb5e6e6200b8a5689bfeedcec77e73eba24bb905ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-texttable \
python3.10dist(texttable) \
python310-texttable \
python3dist(texttable)"

RDEPENDS:${PN} += "python(abi) \
python310-base"

inherit rpm
