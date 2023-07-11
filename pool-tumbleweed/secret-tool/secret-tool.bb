SUMMARY = "Store and retrieve passwords"
DESCRIPTION = "Secret-tool is a command line tool that can be used to store and \
retrieve passwords."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "secret-tool-0.20.5-1.8.aarch64.rpm"
RPM_HASH = "85be7af09311782add51bbf8a26c4cb27ba2df4211e73fd0ec6f4b6d95ecc26e50ca4e8ef726a9411a78a9f5f322f46cb9b144227615996218843f78e084fb15"

RPROVIDES:${PN} += "libsecret-tools \
secret-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
