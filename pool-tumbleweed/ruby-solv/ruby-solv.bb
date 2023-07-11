SUMMARY = "Ruby bindings for the libsolv library"
DESCRIPTION = "Ruby bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "ruby-solv-0.7.24-1.3.aarch64.rpm"
RPM_HASH = "22920370e0316cb8d06e789705b448703657bdcbdddc5f3b92655847b7b5945215004968e46365880b6776a15446740c9989711c13c36f12abbd688b6c0ce79d"

RPROVIDES:${PN} += "ruby-solv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
