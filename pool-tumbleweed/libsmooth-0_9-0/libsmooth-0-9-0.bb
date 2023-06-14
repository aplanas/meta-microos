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

PV = "0.9.9"

RPM_NAME = "libsmooth-0_9-0-0.9.9-1.5.aarch64.rpm"
RPM_HASH = "3b2ec37f527ea628126b83726e68db33929e696f8e2978a13daf3fa44d187d40128475ac02ba464ab60969762517725d2b9f6d77d97ee86d4e7b1c5b89f9d21a"

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
