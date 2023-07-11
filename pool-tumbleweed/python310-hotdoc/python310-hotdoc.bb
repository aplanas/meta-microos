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

RPM_NAME = "python310-hotdoc-0.15-1.3.aarch64.rpm"
RPM_HASH = "1ab95287090b4bcb2269185c35c7563223d7e854a9c826e7f5972f2c9cf61f674b55bb8afa30cb85fac4f1aab4147f1bc1554ffef8c5925b146408877f461658"

RPROVIDES:${PN} += "python3.10dist-hotdoc \
python310-hotdoc \
python3dist-hotdoc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
clang-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjson-glib-1.0.so.0 \
libxml2.so.2 \
llvm-devel \
python-abi \
python310-PyYAML \
python310-appdirs \
python310-cchardet \
python310-dbus-deviation \
python310-feedgen \
python310-lxml \
python310-networkx \
python310-pkgconfig \
python310-schema \
python310-toposort \
python310-wheezy.template \
update-alternatives"

inherit rpm
