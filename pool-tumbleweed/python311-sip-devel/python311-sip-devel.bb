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

RPM_NAME = "python311-sip-devel-6.7.9-4.5.noarch.rpm"
RPM_HASH = "12059a6fe76796682b8f99454f2021eaf876ea64770ac81a022504ee84183d8fd25f38e723f1dd4232fdd64a8edd12503a582c4921cf905168566f518a1c8d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-sip-devel"

RDEPENDS:${PN} += "python311-sip6-devel"

inherit rpm
