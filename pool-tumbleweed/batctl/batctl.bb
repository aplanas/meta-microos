SUMMARY = "B.A.T.M.A.N. advanced control and management tool"
DESCRIPTION = "Why do I need batctl?  B.A.T.M.A.N. advanced operates on layer 2 and \
thus all hosts participating in the virtual switch are completely \
transparent for all protocols above layer 2.  Therefore the common \
diagnosis tools do not work as expected.  To overcome these problems \
batctl was created.  At the moment batctl contains ping, traceroute, \
tcpdump and interfaces to the kernel module settings."
LICENSE = "GPL-2.0-only & MIT"

PV = "2023.1"

RPM_NAME = "batctl-2023.1-1.1.aarch64.rpm"
RPM_HASH = "a8d80184d3c51d64549bcc9501b3128ba8417358062cf3cb7dcc7d808275dcf41b69aee734272184eff88a6c63eeddf6a645082539d62f18ec2412a2ae520d69"

RPROVIDES:${PN} += "batctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
