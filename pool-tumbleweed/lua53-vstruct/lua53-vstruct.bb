SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.1.1+git2"

RPM_NAME = "lua53-vstruct-2.1.1+git2-2.1.noarch.rpm"
RPM_HASH = "ff479170ba074a6625d08ce7f5ff662738753466cdcc156df9e8b3a31af63cb0a7025c3551fd0ea3decdc68cf0ff8041f4f74843facee54e39a0e15c6f7c11fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-vstruct"

RDEPENDS:${PN} += "lua53"

inherit rpm
