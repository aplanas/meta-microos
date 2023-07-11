SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-feather-2.0.2-4.1.noarch.rpm"
RPM_HASH = "26266310c841de57b8ae35b4cf8883b3d0c5d09ba8227f08cd42f99f06e143c388217cc7b741251bd38557f987582f3d249e804cc727fa28fc9415e14e95da50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-feather"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
