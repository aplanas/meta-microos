SUMMARY = "Russian Charset Detection Library"
DESCRIPTION = "librcd is a library for automatic encoding detection of \
Russian/Ukrainian language texts. It is optimized for very small \
words and phrases."
LICENSE = "LGPL-2.1+"

PV = "0.1.14"

RPM_NAME = "librcd0-0.1.14-4.26.aarch64.rpm"
RPM_HASH = "848cca9c7d54e49bd2d888571c93bf2b7e73c2f0707f6e58ab472a51903c83db7079973f0f30263000ff289309231668c0fee3aaa25074c2065077d173b82765"

RPROVIDES:${PN} += "librcd.so.0()(64bit) \
librcd0 \
librcd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
