SUMMARY = "Luabind headers"
DESCRIPTION = "Luabind is a library that helps you create bindings between C++ and Lua. \
It has the ability to expose functions and classes, written in C++, to Lua. \
This package contains needed development files like headers."
LICENSE = "MIT"

PV = "0.9.1+git20150408.a0edf58"

RPM_NAME = "luabind-devel-0.9.1+git20150408.a0edf58-2.13.aarch64.rpm"
RPM_HASH = "23d51397d02b5595f3567b5d0b3dad1d1a3f16b0dd6c942b433fea4a2ad2e04882589a6e46fa142f57e306343ef7c13b333c0d797d3f3be6686c4140a189ba54"

RPROVIDES:${PN} += "luabind-devel \
pkgconfig-luabind"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluabind0-9-1 \
lua53-devel"

inherit rpm
