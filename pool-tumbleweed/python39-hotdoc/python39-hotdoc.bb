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

RPM_NAME = "python39-hotdoc-0.15-1.2.aarch64.rpm"
RPM_HASH = "54279764f69e16387d44ae81740b92619dd194869693fb17d12d404febf55563103d80089771b73b0b327ef08cb9edb9c69c4bf319bf2649c974b87d1f952b35"

RPROVIDES:${PN} += "python3.9dist(hotdoc) \
python39-hotdoc \
python39-hotdoc(aarch-64) \
python3dist(hotdoc)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
/usr/bin/sh \
clang-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
llvm-devel \
python(abi) \
python39-PyYAML \
python39-appdirs \
python39-cchardet \
python39-dbus-deviation \
python39-feedgen \
python39-lxml \
python39-networkx \
python39-pkgconfig \
python39-schema \
python39-toposort \
python39-wheezy.template \
update-alternatives"

inherit rpm
