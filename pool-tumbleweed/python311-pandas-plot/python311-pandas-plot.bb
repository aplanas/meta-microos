SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-plot-2.0.2-4.1.noarch.rpm"
RPM_HASH = "61ea0b165e10b8b236ddc297e4bb501168081c0bb6f98bd70883ca48d56fe846573fbdae794b7c6246d13fc9fc890db1ef8f60789b2513e2bc0d1a8defac1477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-plot \
python311-pandas-plot"

RDEPENDS:${PN} += "python311-matplotlib \
python311-pandas"

inherit rpm
