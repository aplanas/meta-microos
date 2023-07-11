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

RPM_NAME = "libpsl-devel-0.21.2-1.3.aarch64.rpm"
RPM_HASH = "23634558bf57a7195d499990d66e5b117d8e501840a05b4fb68c1f851f6bef58a8a44bd01e82eba6916b138eda9ff12a2feaf495ad2a0e2e478d7797ab023f9f"

RPROVIDES:${PN} += "libpsl-devel \
pkgconfig-libpsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpsl5"

inherit rpm
