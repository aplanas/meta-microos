SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python311-jaraco.functools-3.6.0-2.1.noarch.rpm"
RPM_HASH = "29832b2c60e23617cc479fbccff57e65b4172a73fdc0d35e3beef493292d3f619ae57a101db629eb62de7faacc07c3a704941d81290a3c2f852d3b863193f540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jaraco.functools \
python311-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.packaging \
python311-more-itertools"

inherit rpm
