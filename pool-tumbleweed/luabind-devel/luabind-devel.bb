SUMMARY = "Luabind headers"
DESCRIPTION = "Luabind is a library that helps you create bindings between C++ and Lua. \
It has the ability to expose functions and classes, written in C++, to Lua. \
This package contains needed development files like headers."
LICENSE = "MIT"

PV = "0.9.1+git20150408.a0edf58"

RPM_NAME = "luabind-devel-0.9.1+git20150408.a0edf58-2.14.aarch64.rpm"
RPM_HASH = "b365b25a9a127e342aa108945f8cdc7950a7be2040c3834d46cc5859ebbe76c2c70e12d07590637e3d60862a494f41760605f262307cf238724fde23b4995092"

RPROVIDES:${PN} += "luabind-devel \
pkgconfig-luabind"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluabind0-9-1 \
lua53-devel"

inherit rpm
