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

RPM_NAME = "smooth-0.9.10-1.1.aarch64.rpm"
RPM_HASH = "229088ab561fdbed5830daba5c256725b1ffc363d0dab23800561323f1ad12c87b4c30f6e00d724ca7e0b1c32e63bd4b7abd22466f10b23aa72a30b9b2b84e1e"

RPROVIDES:${PN} += "smooth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsmooth-0.9.so.0 \
libstdc++.so.6"

inherit rpm
