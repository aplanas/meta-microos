SUMMARY = "B.A.T.M.A.N. advanced control and management tool"
DESCRIPTION = "Why do I need batctl?  B.A.T.M.A.N. advanced operates on layer 2 and \
thus all hosts participating in the virtual switch are completely \
transparent for all protocols above layer 2.  Therefore the common \
diagnosis tools do not work as expected.  To overcome these problems \
batctl was created.  At the moment batctl contains ping, traceroute, \
tcpdump and interfaces to the kernel module settings."
LICENSE = "GPL-2.0-only & MIT"

PV = "2023.0"

RPM_NAME = "batctl-2023.0-1.4.aarch64.rpm"
RPM_HASH = "5e27a7d12aa3808856a01a83066f58f81812ae60dd3b65f2dda2ebe19762c1abf40dab91c781f41518ad2b297fb82aa3774cb8835b6aae7121d3faac03f83a72"

RPROVIDES:${PN} += "batctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
