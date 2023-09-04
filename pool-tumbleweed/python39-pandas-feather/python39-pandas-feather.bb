SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-feather-2.0.3-1.2.noarch.rpm"
RPM_HASH = "1d73212fbbfe6ea0fb69aafb2f91311abd1135d50bd784af14419574f5a42f8a99c4e26bbbce5b86a9e245497c077f2a859fcaba76dba5bc17c55fec01b23ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-feather"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
