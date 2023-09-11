SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-plot-2.0.3-1.3.noarch.rpm"
RPM_HASH = "bf544b3c7ea4a4f527f63de9c2fdf066a4bb78e5186d427c924282086ce4ee8f147ce30df9e68de2682d1111b1cf2d43219d2de723fdd873c806356aafff29bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-plot \
python311-pandas-plot"

RDEPENDS:${PN} += "python311-matplotlib \
python311-pandas"

inherit rpm
