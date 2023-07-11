SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python311-sip4-4.19.25-7.1.aarch64.rpm"
RPM_HASH = "5b5dea3928a7b6dc6250c50ee75513b3020548a42b56b3b66ed4b2fc8b7e85fd47db662a97535afa72531a736dfd46f7397319cdc6e95a50e9de4ea7760e1d59"

RPROVIDES:${PN} += "python3-sip \
python3-sip-api \
python3-sip4 \
python3.11dist-sip \
python311-sip \
python311-sip-api \
python311-sip4 \
python3dist-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
python311-sip4-common"

inherit rpm
