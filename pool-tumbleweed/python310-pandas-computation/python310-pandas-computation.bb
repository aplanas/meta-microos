SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-computation-2.0.3-1.2.noarch.rpm"
RPM_HASH = "05775fe39ea2e2be850d3b2d76b34814a5fe7a45f49c3cbc86d163f9743c9dfaaa07f5d72cca87bf7b82bb989f0027f91792aec041d01d88555557a71c90b342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-computation"

RDEPENDS:${PN} += "python310-pandas \
python310-scipy \
python310-xarray"

inherit rpm
