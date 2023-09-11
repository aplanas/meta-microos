SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-computation-2.0.3-1.3.noarch.rpm"
RPM_HASH = "7482a165bf4a9e44f4734c3cf17e8e8d429c182ae416e47cf3f2c3f88b5e743be58dca198005fcb7bf87d954094b6ddad0dff30a918e844c719bcefd0071e50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-computation \
python311-pandas-computation"

RDEPENDS:${PN} += "python311-pandas \
python311-scipy \
python311-xarray"

inherit rpm
