SUMMARY = "SIP tool to create python bindings -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains common documentation files shared between python2 \
and python3 versions of sip."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python-sip4-doc-4.19.25-7.1.noarch.rpm"
RPM_HASH = "2937a66ba6a894fb6493b4da985d43ca2769471bb92bbba140c95e0e528052e7b4ec0758b65b7ef4310fefd8bf854f06ea96b92e0f6e35e889c2a7c61208cafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip4-doc \
python310-sip4-doc \
python311-sip4-doc \
python39-sip4-doc"

RDEPENDS:${PN} += ""

inherit rpm
