SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-computation-2.0.3-1.3.noarch.rpm"
RPM_HASH = "6ebb9431529fe8740dc41e7f46bf8ba7bf5100963f7aba2fc8a9c589cf4d3f00974e6238a7a6ad10f15f8546a3b7426209aea372fba1767fb0fb59912dee057e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-computation"

RDEPENDS:${PN} += "python310-pandas \
python310-scipy \
python310-xarray"

inherit rpm
