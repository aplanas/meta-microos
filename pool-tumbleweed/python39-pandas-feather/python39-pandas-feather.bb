SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-feather-2.0.3-1.3.noarch.rpm"
RPM_HASH = "ea82d8aaead893aaa06a37267936725979d03b12390b161cdfb08d1d69fc2bb0d4d04e4094d0df1182c22954410e05745ef03d523ba7bc2e6b5724e8d1e1d706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-feather"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
