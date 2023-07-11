SUMMARY = "DropBox support for the Nemo Filemanager"
DESCRIPTION = "Nemo-dropbox adds DropBox support to the Nemo filemanager."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-dropbox-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "8dc052eed4b9cb1705cebfaaa677d857e4168a5a0312db137c482360571f617e5fbe3b9e62ea94df508788a969f4b63ab3102fcfb773be5472a4cada53b65e2b"

RPROVIDES:${PN} += "libnemo-dropbox.so \
nemo-dropbox \
nemo-extension-dropbox"

RDEPENDS:${PN} += "/sbin/ldconfig \
dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
