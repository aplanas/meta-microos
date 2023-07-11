SUMMARY = "SIP tool to create python bindings"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python311-sip4-devel-4.19.25-7.1.aarch64.rpm"
RPM_HASH = "29543541e08b5aa4c5cabaa02cca3d9cc6de781048caf8a1e33540b50daa0e1cf09cc609e8ec83e0155eb4ff8124a5ae1324b6db8214fd4a63959aafcaec2780"

RPROVIDES:${PN} += "python3-sip-bin \
python3-sip-devel \
python3-sip4-devel \
python311-sip-bin \
python311-sip-devel \
python311-sip4-devel \
rpm-macro-requires-python311-sip-api"

RDEPENDS:${PN} += "/usr/bin/sh \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-devel \
python311-sip4 \
python311-sip4-common \
update-alternatives"

inherit rpm
