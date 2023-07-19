SUMMARY = "Fileroller support for the Nemo Filemanager"
DESCRIPTION = "Nemo-fileroller adds File-roller support to the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-fileroller-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "18d9dd723e2a4613dacad9b917b6ee4131e9312c4f2e10d3dfb52b13238c9c3aca14f941ca218cc675d92963ea2a4df49685e85d9e4a8f38c9eb9afd908e75bb"

RPROVIDES:${PN} += "libnemo-fileroller.so \
nemo-extension-fileroller \
nemo-fileroller"

RDEPENDS:${PN} += "/sbin/ldconfig \
file-roller \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
