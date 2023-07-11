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

RPM_NAME = "python310-sip4-devel-4.19.25-7.1.aarch64.rpm"
RPM_HASH = "34b084f64c563b73b7dfa6877ddaec8f85dc1d76c085dbe052bfae199cc9b1079fd1d32fc767d3397af92f3a8432db5150366f230ac01bcc445099ba65a3026e"

RPROVIDES:${PN} += "python310-sip-bin \
python310-sip-devel \
python310-sip4-devel \
rpm-macro-requires-python310-sip-api"

RDEPENDS:${PN} += "/usr/bin/sh \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-devel \
python310-sip4 \
python310-sip4-common \
update-alternatives"

inherit rpm
