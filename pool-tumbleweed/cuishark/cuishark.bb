SUMMARY = "A protocol analyzer like a wireshark on CUI"
DESCRIPTION = "A console based wireshark like protocol analyzer. \
It is using libwireshark for the protocol dissection."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "cuishark-0.1.2-2.13.aarch64.rpm"
RPM_HASH = "d347bb93f44fe6acaf9484c73ea68926b465c9abafdba7409ff1c6456782e085bd5b9a866b54fde383b62d48840dac2e82af26360af69de9fb511bcd159524f6"

RPROVIDES:${PN} += "cuishark"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpcap.so.1 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
