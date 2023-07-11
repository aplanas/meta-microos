SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-greenlet-devel-2.0.2-1.3.noarch.rpm"
RPM_HASH = "afbfe2d2632c0ebefece260df0912f4702104b75bc81ab2f9fd6e40e8032b8e3d4c31305b33af8c3e828f7bdba5cd78f337f9e09e1c372046bf99fe86ef1c5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-greenlet-devel \
python311-greenlet-devel"

RDEPENDS:${PN} += "python311-greenlet"

inherit rpm
