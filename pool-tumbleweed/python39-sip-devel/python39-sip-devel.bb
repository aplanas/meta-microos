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

RPM_NAME = "python39-sip-devel-6.7.9-4.5.noarch.rpm"
RPM_HASH = "e5ded7953f1e36cb7bae0cdb3a3683465087d6987fda7eb6ba9ad92d199984f90da4cd53c74bb4d6ab6e84587e0c3d26fcdf445d37da2087f0af0492ec37e5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sip-devel"
RDEPENDS:${PN} += "python39-sip6-devel"

inherit rpm
