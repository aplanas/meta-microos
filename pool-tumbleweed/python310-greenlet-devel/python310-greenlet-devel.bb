SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-greenlet-devel-2.0.2-1.1.noarch.rpm"
RPM_HASH = "9a1eb51af708a632c4d3c1543c0108e797a9cee522af093a14f51c10528ad8598563a15f330bd3128148184c378d3081114b4e18755278ed622df2351a22cd7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-greenlet-devel \
python310-greenlet-devel"
RDEPENDS:${PN} += "python310-greenlet"

inherit rpm
