SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-computation-2.0.2-4.1.noarch.rpm"
RPM_HASH = "909e3b49d42ac6c9cf83b1edbc618101e2c2906493cc2269d87d1a91c8bdc5cfa556db54e18cf7b4f9426ad2c27dad2f727e568ca3024a2d0d7e31aa7e937cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-computation"

RDEPENDS:${PN} += "python39-pandas \
python39-scipy \
python39-xarray"

inherit rpm
