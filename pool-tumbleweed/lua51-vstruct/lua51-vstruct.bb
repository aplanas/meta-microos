SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.1.1+git2"

RPM_NAME = "lua51-vstruct-2.1.1+git2-2.1.noarch.rpm"
RPM_HASH = "518c9daf2ae97ea1c18ae5eb7115ae4c89f8c3ae72ee7896edac3a8babcd6e8963d0c261a5aa6f99417bcca07ed4d6e8ac258eb96d005ad68d45537987074804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-vstruct"

RDEPENDS:${PN} += "lua51"

inherit rpm
