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

RPM_NAME = "python311-sip6-devel-6.7.9-2.1.aarch64.rpm"
RPM_HASH = "ca57c7e0238936d5235109f232493b56fb5044e734b94de7170c124a1c5cdc5f625fa0b12ff498daaa43c16e3d2ee9f3de718cebda6d9c382232c4382091b8c2"

RPROVIDES:${PN} += "python3.11dist-sip \
python311-sip-devel \
python311-sip-impl \
python311-sip6-devel \
python3dist-sip"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-devel \
python311-packaging \
python311-ply \
python311-setuptools \
update-alternatives"

inherit rpm
