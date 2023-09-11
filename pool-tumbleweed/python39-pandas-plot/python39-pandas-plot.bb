SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-plot-2.0.3-1.3.noarch.rpm"
RPM_HASH = "672a2ff636be40b43de203b6e0ce129686a45ad7dda078b3139ad4041bc0f2ac0204d5e97234bbe19f536454181344d492e60b11f61b6c1e4ace350f265283ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-plot"

RDEPENDS:${PN} += "python39-matplotlib \
python39-pandas"

inherit rpm
