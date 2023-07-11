SUMMARY = "A library for wxWidgets support in Erlang"
DESCRIPTION = "A Graphics System used to write platform independent user interfaces."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-wx-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "b1ff2b5c6b3c294b2933a35f6270f485872fe4e615dbfacec461284792db233dbcc039870af5c9fcde20124352742d7b5799e91a2bc42ff683c3f97cd85d0124"

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
