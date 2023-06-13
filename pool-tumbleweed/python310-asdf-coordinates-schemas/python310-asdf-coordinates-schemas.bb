SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-asdf-coordinates-schemas-0.1.0-1.7.noarch.rpm"
RPM_HASH = "d9c6bb424d208dbbff4b8c5d1d4c28b36a66ec35cf60b9a793c202ee4c49d875e9b10b28d4e72c76b455d62e63060f19a97e54d4395341ae8004e5416f5eb4ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-coordinates-schemas \
python3.10dist(asdf-coordinates-schemas) \
python310-asdf-coordinates-schemas \
python3dist(asdf-coordinates-schemas)"

RDEPENDS:${PN} += "python(abi) \
python310-asdf"

inherit rpm
