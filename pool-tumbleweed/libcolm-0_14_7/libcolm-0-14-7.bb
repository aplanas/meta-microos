SUMMARY = "The Colm programming language runtime"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "libcolm-0_14_7-0.14.7-2.4.aarch64.rpm"
RPM_HASH = "4c3ebfcc2860dfffca1e7ec762850cebc27fac11ad171b78a0193e52609d7622e6df7d5847aa621217149f071de0ab47a2078dd5f881952b7b1f6db380a47866"

RPROVIDES:${PN} += "libcolm-0.14.7.so()(64bit) \
libcolm-0_14_7 \
libcolm-0_14_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
