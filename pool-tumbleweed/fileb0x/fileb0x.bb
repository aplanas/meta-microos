SUMMARY = "Tool to embed files in go applications"
DESCRIPTION = "A better customizable tool to embed files in go. \
 \
It is an alternative to `go-bindata` that have better features and organized configuration."
LICENSE = "MIT"

PV = "v1.1.1~git10.d54f404"

RPM_NAME = "fileb0x-v1.1.1~git10.d54f404-1.10.aarch64.rpm"
RPM_HASH = "8a02e6b660881f684d16ed7a6a3e0ab8145680f856fab088eb62b86b4e828033a2a754ab10bda613e452ce1824e6e8b82ba934e97e32558c1be44ab3cccd42a7"

RPROVIDES:${PN} += "fileb0x"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
