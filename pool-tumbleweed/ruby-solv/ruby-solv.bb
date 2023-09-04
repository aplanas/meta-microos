SUMMARY = "Ruby bindings for the libsolv library"
DESCRIPTION = "Ruby bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "ruby-solv-0.7.24-1.4.aarch64.rpm"
RPM_HASH = "2a3e16ebc4edfb7588908984535f6b54a345b6baa00cf7822e9bcc5c8554d9243ac208a046c573c4f0a17e16ab9a0d9f6aa34d54113371ebc850c0edea707657"

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
