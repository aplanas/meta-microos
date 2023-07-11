SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python39-sip6-devel-6.7.9-2.3.aarch64.rpm"
RPM_HASH = "705a526b7de606f95303bc401af2a43c565d2b641a61c02e4c186b7a83b0266db422f1bcb926d1656089d1ce63155196fdd1b6f488d5d2b7d09056809f8a7227"

RPROVIDES:${PN} += "python3.9dist-sip \
python39-sip-devel \
python39-sip-impl \
python39-sip6-devel \
python3dist-sip"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-devel \
python39-packaging \
python39-ply \
python39-setuptools \
update-alternatives"

inherit rpm
