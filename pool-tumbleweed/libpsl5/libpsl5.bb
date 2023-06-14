SUMMARY = "C library for the Publix Suffix List"
DESCRIPTION = "libpsl is a C library to handle the Public Suffix List. A 'public suffix' is a \
domain name under which Internet users can directly register own names. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site."
LICENSE = "MIT & MPL-2.0"

PV = "0.21.2"

RPM_NAME = "libpsl5-0.21.2-1.2.aarch64.rpm"
RPM_HASH = "2e7aceddbae3916ecda7156af3da01d5b43b6f23bf9b210f729eb4edca306eadc6c2055801b219b5c1fcde602094bf433217b62f7315ebcb32e6f27f799033fd"

RPROVIDES:${PN} += "libpsl.so.5 \
libpsl5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
libunistring.so.5"

inherit rpm
