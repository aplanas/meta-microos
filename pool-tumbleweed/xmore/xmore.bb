SUMMARY = "Plain text display utility for X"
DESCRIPTION = "xmore is a plain text browser."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "xmore-1.0.3-2.7.aarch64.rpm"
RPM_HASH = "713e51d6eda8a4b2f19d92da060aa4481bc3f5e288a1e80826a543bfee02c0d28c4f703272eacf8f348d9cb553da5b171761d29f80d64c3a2947b849955d608a"

RPROVIDES:${PN} += "xmore \
xmore(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
