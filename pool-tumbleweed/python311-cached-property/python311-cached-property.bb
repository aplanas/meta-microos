SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "python311-cached-property-1.5.2-4.3.noarch.rpm"
RPM_HASH = "1da6279b3774d736a4763e6e76fe41bf4a48ed94013b13bb4489751ad411cb4f41f5ff2f6ca2d4bddce76320e74cbc4e5b6e786cc76ea46f390df56b77781655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cached-property \
python3.11dist-cached-property \
python311-cached-property \
python3dist-cached-property"

RDEPENDS:${PN} += "python-abi"

inherit rpm
