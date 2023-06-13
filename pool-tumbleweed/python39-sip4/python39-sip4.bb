SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python39-sip4-4.19.25-6.5.aarch64.rpm"
RPM_HASH = "46029a38ae40b4b5a1bb6c70a56798c29d2cd05ac8fac9dd881ba18b8b6cb06799e01dec979ad8368275734b20efaa8f07e0e7a1558f03ff8f7d0c8c3220fc2a"

RPROVIDES:${PN} += "python3.9dist(sip) \
python39-sip \
python39-sip(api) \
python39-sip4 \
python39-sip4(aarch-64) \
python3dist(sip)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpython3.9.so.1.0()(64bit) \
python(abi) \
python39-sip4-common"

inherit rpm
