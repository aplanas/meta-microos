SUMMARY = "C++ class library for widgets, IO, XML and more"
DESCRIPTION = "smooth is an object oriented C++ class library. It provides basic \
functionality and platform support for applications and libraries. \
 \
Features provided by smooth include: \
 \
  * user interface API with various widgets \
  * multithreading API \
  * file and network IO interface \
  * transparent Unicode and software internationalization support \
  * a libxml2-based XML parser"
LICENSE = "Artistic-2.0"

PV = "0.9.10"

RPM_NAME = "libsmooth-0_9-0-0.9.10-1.1.aarch64.rpm"
RPM_HASH = "ff2ae2e42e0ad6404aa0d0603aa90820a040a6d55c04e732e04fa2742082664b662148169c0382c04321f656894a79cb86ef00c57e847994287c4e65ff8d8f54"

RPROVIDES:${PN} += "libsmooth-0-9-0 \
libsmooth-0.9.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libcpuid.so.16 \
libcurl.so.4 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
