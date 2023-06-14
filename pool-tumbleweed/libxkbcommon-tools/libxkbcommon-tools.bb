SUMMARY = "Utilities from xkbcommon"
DESCRIPTION = "xkbcommon tools for introspection and debugging."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-tools-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "30724622a2eaa7fd8f848ad124c8006f3ef08a81bbb9936ce8a51ef94242cfe9fd9079e1c643323e73cffad321c6434210ef0f17cc516bd79689b235b37a21c8"

RPROVIDES:${PN} += "libxkbcommon-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbregistry.so.0"

inherit rpm
