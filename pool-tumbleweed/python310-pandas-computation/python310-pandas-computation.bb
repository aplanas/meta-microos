SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-computation-2.0.2-4.1.noarch.rpm"
RPM_HASH = "1fd08879ef2a8f7607cef8d9ab7b0ee9dc12d86be535e6e796510a214b64a97d7f48794042eef849a569dafce27d4508fc55ca26e27612cf510adcebfe869b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-computation"

RDEPENDS:${PN} += "python310-pandas \
python310-scipy \
python310-xarray"

inherit rpm
