SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings in the currently default version. Look for \
python39-sip<N>-devel, if you need to build a package with a \
specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python39-sip-devel-6.7.9-5.3.noarch.rpm"
RPM_HASH = "f30960c0f96641b83fedafa652085c4d6086b66e44421932ef85faf55b71fd276d621b8baa5459458f3821633ab27c5fa1c84e5956a30682740a4484dd97beb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sip-devel"

RDEPENDS:${PN} += "python39-sip6-devel"

inherit rpm
