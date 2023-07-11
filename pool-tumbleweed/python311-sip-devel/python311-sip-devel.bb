SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings in the currently default version. Look for \
python311-sip<N>-devel, if you need to build a package with a \
specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python311-sip-devel-6.7.9-5.3.noarch.rpm"
RPM_HASH = "e5e077b1ea01fd460c8d972174aff5985672a78c3ce97305b403f9f6c8fa2f8a2cd84a05dbf61431a6928563074d1c4e6d5b0f67320356261a7bc56bcaf955f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sip-devel \
python311-sip-devel"

RDEPENDS:${PN} += "python311-sip6-devel"

inherit rpm
