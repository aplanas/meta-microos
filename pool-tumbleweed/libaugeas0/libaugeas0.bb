SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "libaugeas0-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "2a52eb00b1afdb804b28e30e120557b62ef80d1d7944ba2b61dadacee9dfbe4fad8a82fa19b1065659c2014323fa34bebd27db85c008feea63e0e721c19cf962"

RPROVIDES:${PN} += "libaugeas.so.0 \
libaugeas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfa.so.1 \
libxml2.so.2"

inherit rpm
