SUMMARY = "Development files for libpsl"
DESCRIPTION = "libpsl is a C library to handle the Public Suffix List. A 'public suffix' is a \
domain name under which Internet users can directly register own names. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site. \
 \
This package contains libraries and header files. \
Developer documentation is in /usr/share/doc/packages/libpsl-devel/html ."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "libpsl-devel-0.21.2-1.2.aarch64.rpm"
RPM_HASH = "265033c1e2528a169d58a78ee3f029657bf41671299f90999908ce7f055298507110522117991011c541c1f0bcc5e8448d0b1589cd1c639046fda1835b443a55"

RPROVIDES:${PN} += "libpsl-devel \
libpsl-devel(aarch-64) \
pkgconfig(libpsl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpsl5"

inherit rpm
