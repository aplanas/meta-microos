SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "python39-cached-property-1.5.2-4.3.noarch.rpm"
RPM_HASH = "69e11e627ac4cf87147150bb1d655f32275dc2cf61254220a701a770205123e5827915eeec0e373e5dc01f7494f71e73a9f71fe7e54470c6d41f735818d85b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cached-property \
python39-cached-property \
python3dist-cached-property"

RDEPENDS:${PN} += "python-abi"

inherit rpm
