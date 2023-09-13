SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-plot-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e43ec0ad8868461498b68dbef7a3b080489240c1c1f8f4ca389f3aa4f0f4d84616e1dca43c16c10c9804b8306d8f5788996c16c0685b91537a3dc114375b2898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-plot \
python311-pandas-plot"

RDEPENDS:${PN} += "python311-matplotlib \
python311-pandas"

inherit rpm
