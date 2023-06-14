SUMMARY = "A library for wxWidgets support in Erlang"
DESCRIPTION = "A Graphics System used to write platform independent user interfaces."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-wx-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "a3e72064df6a8027e97d613b1696c729c2de05bb90b3b9b3b1a9f41b62a32d9bb4eba0bd9b34cff48f6a2e3dc72a6fc3ad9bc360b99c14fb9a8f0fe791be5b9d"

RPROVIDES:${PN} += "erlang-wx"

RDEPENDS:${PN} += "erlang \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-gl-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0 \
libwx-gtk2u-stc-suse.so.9.0.0 \
libwx-gtk2u-xrc-suse.so.9.0.0 \
wxWidgets"

inherit rpm
