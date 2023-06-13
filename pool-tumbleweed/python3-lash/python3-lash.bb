SUMMARY = "Python bindings for LASH"
DESCRIPTION = "This package contains the language bindings for Python."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "python3-lash-0.5.4-2.11.aarch64.rpm"
RPM_HASH = "d884f7908125d0f0609773ef063a3533bb45e9b846ca562c1d9efa6eb197032cdc26098e051c5fa3c0049b4333eb86951a68fb33eaca357d6c8618fce86c6143"

RPROVIDES:${PN} += "python3-lash \
python3-lash(aarch-64)"

RDEPENDS:${PN} += "lash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblash.so.1()(64bit) \
python(abi)"

inherit rpm
