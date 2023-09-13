SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-computation-2.1.0-1.2.noarch.rpm"
RPM_HASH = "71e144611ed846f0e472ebfea7d751b1fee0868b677db843f7bdc1cb3ebc3ffa1c721d3937b92712dd45910d3fac5b5590be9e97b0ccf637189aded9f2847334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-computation \
python311-pandas-computation"

RDEPENDS:${PN} += "python311-pandas \
python311-scipy \
python311-xarray"

inherit rpm
