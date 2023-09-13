SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-computation-2.1.0-1.2.noarch.rpm"
RPM_HASH = "57d2bbd5ebf4d72e35fd9f7b0a6c9917d0394e46666aa48edeb656effd2dd803fe816c1e8f548803f15f273beb5af03420ce5b4f55337428e23c19cf8012ad29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-computation"

RDEPENDS:${PN} += "python39-pandas \
python39-scipy \
python39-xarray"

inherit rpm
