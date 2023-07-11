SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python310-sip4-4.19.25-7.1.aarch64.rpm"
RPM_HASH = "bdf53ebf2479c0767a0f069cd5f99956bfa7e429b13ae68c2cc7dfe680bd0051490361e3e4deae6dd24d5cc3cfc82a9d5525a6e716fd349b379d5ed82c473b32"

RPROVIDES:${PN} += "python3.10dist-sip \
python310-sip \
python310-sip-api \
python310-sip4 \
python3dist-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
python310-sip4-common"

inherit rpm
