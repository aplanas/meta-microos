SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-plot-2.0.2-4.1.noarch.rpm"
RPM_HASH = "6bbe9af77b171ed69259451c04307d23bf24759a21fed7b1d9e3c45446b3e9407870715d21c175f8209a962d6c0e59df19595647e3ac7824ffdc41e55c713ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-plot"

RDEPENDS:${PN} += "python310-matplotlib \
python310-pandas"

inherit rpm
