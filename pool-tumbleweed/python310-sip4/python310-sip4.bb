SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python310-sip4-4.19.25-6.5.aarch64.rpm"
RPM_HASH = "b845bd0c0bcfe082c2f73bbbd4f01503cbcfa2f344c7c5d1f3e7552305a032c796bd928877c541c7081897a87bda9eb7c2c222249425c5783b3dc1d9ecbdba36"

RPROVIDES:${PN} += "python3-sip \
python3-sip(api) \
python3-sip4 \
python3.10dist(sip) \
python310-sip \
python310-sip(api) \
python310-sip4 \
python310-sip4(aarch-64) \
python3dist(sip)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpython3.10.so.1.0()(64bit) \
python(abi) \
python310-sip4-common"

inherit rpm
