SUMMARY = "Utilities to inspect Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows 9x/Me REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-tools-20210625-5.7.aarch64.rpm"
RPM_HASH = "3ef44bd48d23b7abc3575b3027e3af11bc0eb73a1a7d5f271cfe2ce965efb4254e788bbb35d2c822d8c5fe4c5c28ea3ec10ac45d3b964c76cb1952987a81b81b"

RPROVIDES:${PN} += "libcreg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcreg.so.1 \
libfuse.so.2 \
libuna.so.1"

inherit rpm
