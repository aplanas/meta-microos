SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-computation-2.1.0-1.2.noarch.rpm"
RPM_HASH = "19474288aecfa3be3208b8a91d85dd0face0d636529da4d9ecf40b1ab6223d4c3ceabe74a7b7e3cf650819f8291a7da21c8b360ffb43f066f001174d565fb7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-computation"

RDEPENDS:${PN} += "python310-pandas \
python310-scipy \
python310-xarray"

inherit rpm
