SUMMARY = "Logging utilities"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python39-logutils-0.3.5-5.4.noarch.rpm"
RPM_HASH = "8409f90e24bc5619a87ced4ca2ab78a055d286770c9da7e73d4bb072006c806c3544652a4af0e4387dab460a73f91b01a319c3ccf59bae4c952b8023c09546d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-logutils \
python39-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
