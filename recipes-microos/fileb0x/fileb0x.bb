SUMMARY = "Tool to embed files in go applications"
DESCRIPTION = "A better customizable tool to embed files in go. \
 \
It is an alternative to `go-bindata` that have better features and organized configuration."
LICENSE = "MIT"

PV = "v1.1.1~git10.d54f404"

RPM_NAME = "fileb0x-v1.1.1~git10.d54f404-1.8.aarch64.rpm"
RPM_HASH = "7cdbc0a9458fe14c30d48c9526f3206c555f206fa9180347af45321c2a0465ff5ef25e37ff6bdcf3acc9d8e5f4aaff58b2c5fd96ead3588ff22d80f44ad1bbdf"

RPROVIDES:${PN} += "fileb0x fileb0x(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
