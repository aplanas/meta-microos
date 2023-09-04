SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-plot-2.0.3-1.2.noarch.rpm"
RPM_HASH = "876465445d15163bc27d705156bd353b82886b30bfecdae15959796151e5397c0633ffeb8b42a392a3f9b904f75c22ea06600e8f4347aa9a617841475eb9ff56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-plot \
python311-pandas-plot"

RDEPENDS:${PN} += "python311-matplotlib \
python311-pandas"

inherit rpm
