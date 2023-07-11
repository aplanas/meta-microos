SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python311-jaraco.itertools-6.2.1-2.3.noarch.rpm"
RPM_HASH = "898777b6e1d7c9494b4ee9606ba7f6c3b778ff9cf7089a0b559196201a65707c06bad1c34e8e1086a3dae2de8178503cc1296bb7d98ae202101c7bd6e33f4098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.itertools \
python3.11dist-jaraco.itertools \
python311-jaraco.itertools \
python3dist-jaraco.itertools"

RDEPENDS:${PN} += "python-abi \
python311-inflect \
python311-more-itertools"

inherit rpm
