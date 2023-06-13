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

RPM_NAME = "python311-xrootd-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "2d19de13d879bafbd3a012e6b426f20ac877f697fe09604098cb883f88633717444a25a15522001953df6c005976adb5ccd2ad9f9a493f1b13f9653f02bc3274"

RPROVIDES:${PN} += "python3.11dist(xrootd) \
python311-xrootd \
python311-xrootd(aarch-64) \
python3dist(xrootd)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libXrdCl.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
