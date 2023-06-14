SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "python39-cached-property-1.5.2-4.1.noarch.rpm"
RPM_HASH = "b3906a5803992296076025be32d3fcb5fa70ff9414b5eaa65c363fd135e8015b7c115ea6827f57f71621ac2dc6171881915ac839797e46aa9c9b404b6b139633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cached-property \
python39-cached-property \
python3dist-cached-property"

RDEPENDS:${PN} += "python-abi"

inherit rpm
