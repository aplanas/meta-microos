SUMMARY = "Python bindings for GlusterFS"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "python3-gluster-11.0-3.1.noarch.rpm"
RPM_HASH = "a1f1e6241c8425e22433bf5a7541282cbc0897c99c9b3236660d7a5d2ae76f3f40cd6d7478bad0d037818f9a138a4fd50607b6ad8d0aaf044c0899761db1d85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gluster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
