SUMMARY = "A Python bindings generator for C/C++ libraries -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains the documentation and example files in the \
currently default version. Look for python311-sip<N>-devel, \
if you need to build a package with a specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python-sip-doc-6.7.9-5.3.noarch.rpm"
RPM_HASH = "da5a2a15df252b0b4fce37cb3e0c4c8024d55b0f3aa8dc59160ad16f045ab91124740746eaa76f465d2b00d8ae2a4aa14153764449354bf0977d1e691809f532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip-doc \
python310-sip-doc \
python311-sip-doc \
python39-sip-doc"

RDEPENDS:${PN} += ""

inherit rpm
