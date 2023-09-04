SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-feather-2.0.3-1.2.noarch.rpm"
RPM_HASH = "5bf8332128e3227b2b85b6a5224c2340e78cfe5653792056399f71219972cc67b5d97f9dc178b15691be1bb105a7ae8bbae7d671b6472d1f031870d11192f7a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-feather \
python311-pandas-feather"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
