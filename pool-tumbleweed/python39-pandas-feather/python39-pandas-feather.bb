SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-feather-2.1.0-1.2.noarch.rpm"
RPM_HASH = "b14cd7489549f585c7badc98642be8dd1e546779112a21920a0ddafe5742890ac9e515dff17effd50072e67dc2a466d76fa0ec2bef246501c0e829f7f40a4965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-feather"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
