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

RPM_NAME = "smooth-0.9.9-1.5.aarch64.rpm"
RPM_HASH = "875a796fe5b1e7607113de9600cced3dc35dfaa9d1d38020a542af229a35a277a400b288a0631196fe5c6ccb8005a5860ffb17f483b597bd68985f9468b94f64"

RPROVIDES:${PN} += "smooth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsmooth-0.9.so.0 \
libstdc++.so.6"

inherit rpm
