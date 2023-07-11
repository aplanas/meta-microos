SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-spss-2.0.2-4.1.noarch.rpm"
RPM_HASH = "f74110a3649e29b83e6cde59f7ab7f00f82cffe6de752ea9abc9887b684b2667b3d81ad229dd6404f4291daaf3bd7097d6e9c62853db0183b53e07b353fca79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-spss \
python311-pandas-spss"

RDEPENDS:${PN} += "python311-pandas \
python311-pyreadstat"

inherit rpm
