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

RPM_NAME = "python310-xrootd-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "79237a4dc4cdf42db0176d46eab4c429fc160a1dac9c18ccd7c6a884a0854a3184ab7bff779bb2bd88deb7874bbe7c4c4606afa3268fc42a4fce6f8765450a9d"

RPROVIDES:${PN} += "python3-xrootd \
python3.10dist(xrootd) \
python310-xrootd \
python310-xrootd(aarch-64) \
python3dist(xrootd)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libXrdCl.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
