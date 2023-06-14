SUMMARY = "An eXtended Root Daemon"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. It is \
based on a scalable architecture, a communication protocol, and \
a set of plugins and tools based on those. The ability to \
configure it and to make it scale (for size and performance) \
allows the deployment of data access clusters of virtually any \
size, which can include sophisticated features, like \
authentication/authorization, integrations with other systems, \
WAN data distribution, etc. \
 \
The XRootD software framework is a generic suite for data access, \
which can serve natively any kind of data, organized as a \
hierarchical filesystem-like namespace, based on the concept \
of a directory."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "python39-xrootd-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "49a3c734d9f386093cea71baf747416ca4a79a92600681f12127ff9b00c8242dee8e95523f8473950e7beebc17a459f174866e302a4a9dadc1054abd4d787bd0"

RPROVIDES:${PN} += "python3.9dist-xrootd \
python39-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXrdCl.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
