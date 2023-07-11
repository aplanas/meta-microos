SUMMARY = "Tab Window Manager for the X Window System"
DESCRIPTION = "twm is a window manager for the X Window System. It provides \
titlebars, shaped windows, several forms of icon management, \
user-defined macro functions, click-to-type and pointer-driven \
keyboard focus, and user-specified key and pointer button bindings."
LICENSE = "HPND"

PV = "1.0.12"

RPM_NAME = "twm-1.0.12-1.7.aarch64.rpm"
RPM_HASH = "b07a671852802eaad44fd659ced680f1cf1b792a3a38942e2aa1be7237ec1ebd2367a844651fecf283f8744e5b268716ef3f44cb9cda1d0c88e7078dc5765680"

RPROVIDES:${PN} += "twm \
windowmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
