SUMMARY = "Linux Studio Plugins (Common files)"
DESCRIPTION = "Common files for lsp-plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-common-1.2.7-1.2.aarch64.rpm"
RPM_HASH = "b165e3eba4506367877098d07fc484a45d28e6b61775892bfaf4506d0e088a23a023929ac9237907fb6265a033f66750fa38e16c9144fe9ec3c6a8c4ceaf8d37"

RPROVIDES:${PN} += "liblsp-r3d-glx-lib-1.0.11.so \
lsp-plugins-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
