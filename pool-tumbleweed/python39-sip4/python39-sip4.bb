SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python39-sip4-4.19.25-7.1.aarch64.rpm"
RPM_HASH = "3776a9116a0f006389ac6d8ccb2baa8a2cf2c5cc96e4fb6bff0576b766acec0437050514fb061fa4017eb66152c3f2630d1d8497227912d49ac40d6daf551ca6"

RPROVIDES:${PN} += "python3.9dist-sip \
python39-sip \
python39-sip-api \
python39-sip4 \
python3dist-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.9.so.1.0 \
python-abi \
python39-sip4-common"

inherit rpm
