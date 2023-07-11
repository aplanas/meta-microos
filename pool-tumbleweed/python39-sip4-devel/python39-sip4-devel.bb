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

RPM_NAME = "python39-sip4-devel-4.19.25-7.1.aarch64.rpm"
RPM_HASH = "e4845d8f3d378bd62be155b8e6126bda2449f4ebc9267a102281454f0fcd26518920a7172d971deaa758f8f8e4d1cc4f1b780ac26c383f1e3797c5f5d18c8193"

RPROVIDES:${PN} += "python39-sip-bin \
python39-sip-devel \
python39-sip4-devel \
rpm-macro-requires-python39-sip-api"

RDEPENDS:${PN} += "/usr/bin/sh \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-devel \
python39-sip4 \
python39-sip4-common \
update-alternatives"

inherit rpm
