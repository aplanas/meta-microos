SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings in the currently default version. Look for \
python310-sip<N>-devel, if you need to build a package with a \
specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python310-sip-devel-6.7.9-5.3.noarch.rpm"
RPM_HASH = "91961d55d4b3278db4554de16544d31dd607acbff34c5a8c97c4b022d80f90d7a810039bf785f7b3ff641bc6875bc0feb4f362d3b4e07cf915c9f515d11f31be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-sip-devel"

RDEPENDS:${PN} += "python310-sip6-devel"

inherit rpm
