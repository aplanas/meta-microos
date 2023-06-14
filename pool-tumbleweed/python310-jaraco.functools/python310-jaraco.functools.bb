SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python310-jaraco.functools-3.6.0-2.1.noarch.rpm"
RPM_HASH = "3886877f0da9617348e3f164d53f44f72befe247f43f68354f79efb4b356b32b7f4f42c889d385705733603d99d4f89b5a0114e784151a57ed501547177f951d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.functools \
python3.10dist-jaraco.functools \
python310-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.packaging \
python310-more-itertools"

inherit rpm
