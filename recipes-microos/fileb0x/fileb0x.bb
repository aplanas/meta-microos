SUMMARY = "Tool to embed files in go applications"
DESCRIPTION = "A better customizable tool to embed files in go. \
 \
It is an alternative to `go-bindata` that have better features and organized configuration."
LICENSE = "MIT"

PV = "v1.1.1~git10.d54f404"

RPM_NAME = "fileb0x-v1.1.1~git10.d54f404-1.9.aarch64.rpm"
RPM_HASH = "cb361e6b8ab8b6a025db075ee5af09ac792753539c17d473c979417360bf2ae7ad09761b2264ebb3a4b6e95b002b20c2a24bf0cdaffefd06324fc8f32decf2d7"

RPROVIDES:${PN} += "fileb0x fileb0x(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
