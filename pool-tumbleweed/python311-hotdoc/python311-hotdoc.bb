SUMMARY = "A documentation tool micro-framework"
DESCRIPTION = "Hotdoc is a documentation framework. It provides an interface for extensions \
to plug upon, along with some base objects (formatters, ...) \
 \
Hotdoc is distributed with a set of extensions that perform various tasks, \
such as parsing C and extracting symbols with clang, parsing \
gobject-introspection (gir) files, highlighting the syntax of code snippets \
with prism, etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15"

RPM_NAME = "python311-hotdoc-0.15-1.3.aarch64.rpm"
RPM_HASH = "1a9f6083e7fde96cec09db6d0440aaa23d6ff042262e815953ad6c48b60a4c9fceb22fdada7b1e2d94afd90f94b5df8adc5638e382e3d310c1d8b8cf419d940e"

RPROVIDES:${PN} += "hotdoc \
python3-hotdoc \
python3.11dist-hotdoc \
python311-hotdoc \
python3dist-hotdoc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
clang-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjson-glib-1.0.so.0 \
libxml2.so.2 \
llvm-devel \
python-abi \
python311-PyYAML \
python311-appdirs \
python311-cchardet \
python311-dbus-deviation \
python311-feedgen \
python311-lxml \
python311-networkx \
python311-pkgconfig \
python311-schema \
python311-toposort \
python311-wheezy.template \
update-alternatives"

inherit rpm
