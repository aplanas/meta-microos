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

RPM_NAME = "python310-sip6-devel-6.7.9-2.1.aarch64.rpm"
RPM_HASH = "9126396504d4e6b8b7d2b8da0ed109e9b2a9ed18aed710a9f97cbbacdfcba8330cb46b79c0ff9b7ea25925765bf62f7ca84e5bdbb3d817956596476822b53efd"

RPROVIDES:${PN} += "python3-sip-devel \
python3-sip-impl \
python3-sip6-devel \
python3.10dist-sip \
python310-sip-devel \
python310-sip-impl \
python310-sip6-devel \
python3dist-sip"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-devel \
python310-packaging \
python310-ply \
python310-setuptools \
update-alternatives"

inherit rpm
