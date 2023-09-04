SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-computation-2.0.3-1.2.noarch.rpm"
RPM_HASH = "f3519f360f15e23926f148c0e522fe0f891135b5a17886507424f8c95cb30b8e090112470050706dc3fd2efe25e106803c6a68474e6882e71edec9e7f0e64a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-computation"

RDEPENDS:${PN} += "python39-pandas \
python39-scipy \
python39-xarray"

inherit rpm
