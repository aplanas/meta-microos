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

RPM_NAME = "python310-sip6-devel-6.7.9-2.3.aarch64.rpm"
RPM_HASH = "e8c365a7d256ceb8c5d22aa800494b7861bae82cb71a83639c2e84c5f281924f0ceedc0c422c7f7c626465acdfaa16b3ed5047eb1ad51c825a8b21907142455b"

RPROVIDES:${PN} += "python3.10dist-sip \
python310-sip-devel \
python310-sip-impl \
python310-sip6-devel \
python3dist-sip"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
