SUMMARY = "A Python bindings generator for C/C++ libraries -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains the documentation and example files."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python-sip6-doc-6.7.9-2.3.aarch64.rpm"
RPM_HASH = "6109f37ef5b79d8388d28e0936f6b25047ed6f4bea1127fc66c05a75667069851d25593c8c2f7e85b7010a92241e654b3346945a8abd2e93b5971231888d137d"

RPROVIDES:${PN} += "python-sip6-doc \
python310-sip6-doc \
python311-sip6-doc \
python39-sip6-doc"

RDEPENDS:${PN} += ""

inherit rpm
