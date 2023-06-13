SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.1.1+git2"

RPM_NAME = "lua54-vstruct-2.1.1+git2-2.1.noarch.rpm"
RPM_HASH = "dde2e553edd265cd5cb50455e739047a73994180e346a10944a072fcad0c2a21b5e470c273b041404549ce3af7531271708416ef0d594fc0c6dfeae9167bcf7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-vstruct \
lua54-vstruct"

RDEPENDS:${PN} += "lua54"

inherit rpm
