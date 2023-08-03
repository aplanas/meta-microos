SUMMARY = "App to securely send files via the internet or local network"
DESCRIPTION = "Warp allows you to securely send files to each other via the internet or local \
network by exchanging a word-based code. \
 \
The best transfer method will be determined using the 'Magic Wormhole' protocol \
which includes local network transfer if possible."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.4"

RPM_NAME = "warp-0.5.4-1.1.aarch64.rpm"
RPM_HASH = "8a01d495b17be5f6c0df765ab39f97ee4155a2d44817dea7aedff12efbb586ab81095e94e693320b5886e3e8369a6d5ab6f2a01f0a617d2969d1e6f316716731"

RPROVIDES:${PN} += "warp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
