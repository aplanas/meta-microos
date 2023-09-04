SUMMARY = "Linux Studio Plugins (Common files)"
DESCRIPTION = "Common files for lsp-plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "lsp-plugins-common-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "a9c3e6ab282494cc3f11eebb8269ff9cefa3f793d7e9d6e3c4cd9f26a24fa21cf4711e7a8e42108f3a70e768cb10d4e734b0c77707538ca0e572567aa7622fde"

RPROVIDES:${PN} += "liblsp-r3d-glx-lib-1.0.13.so \
lsp-plugins-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
