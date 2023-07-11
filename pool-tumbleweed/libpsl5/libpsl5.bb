SUMMARY = "C library for the Publix Suffix List"
DESCRIPTION = "libpsl is a C library to handle the Public Suffix List. A 'public suffix' is a \
domain name under which Internet users can directly register own names. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site."
LICENSE = "MIT & MPL-2.0"

PV = "0.21.2"

RPM_NAME = "libpsl5-0.21.2-1.3.aarch64.rpm"
RPM_HASH = "ee1cc2e071f98027df750a747b62f413d0d1273ab3cbd873f6e3944be4ff6baed58d1c4237274cd7b8eb8d8dce310272a626c03393e50825a73fcc0415131a88"

RPROVIDES:${PN} += "libpsl.so.5 \
libpsl5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
libunistring.so.5"

inherit rpm
