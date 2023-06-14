SUMMARY = "A protocol analyzer like a wireshark on CUI"
DESCRIPTION = "A console based wireshark like protocol analyzer. \
It is using libwireshark for the protocol dissection."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "cuishark-0.1.2-2.12.aarch64.rpm"
RPM_HASH = "9a7483c8d8c424354419403df97123c7ca50cf67e88c79d85b310aa9d27ff4d73356a2064276ec6bd7c6fd51417570949b31beaf8c6e06e907ebece97cbb76a3"

RPROVIDES:${PN} += "cuishark"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpcap.so.1 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
