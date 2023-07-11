SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python311-more-itertools-9.1.0-2.3.noarch.rpm"
RPM_HASH = "b204c29fe7a8c2f3ddaf1686cf8e9d16b7d44ec215912880a7d50312b41d907eb36ce1e7cb3b096c17a50a8df4ffb342a66ca6518a1575d30587ced9eb013a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-more-itertools \
python3.11dist-more-itertools \
python311-more-itertools \
python3dist-more-itertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
