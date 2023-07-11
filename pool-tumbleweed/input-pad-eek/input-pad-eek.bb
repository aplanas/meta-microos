SUMMARY = "Input Pad with eekboard extension"
DESCRIPTION = "The input-pad-eek package contains eekboard extension module"
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-eek-1.0.99.20140916-5.10.aarch64.rpm"
RPM_HASH = "9cba19add40a9caa91be716aed6afd69e730c95861ba166a8eeddd93f30979b24e9de3486de7cc1b54b00c0dbc706f704b27f2e35192d5aa69ea563f1a0fc4e2"

RPROVIDES:${PN} += "input-pad-eek \
libinput-pad-eek-gtk.so"

RDEPENDS:${PN} += "input-pad \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-pad-1.0.so.1"

inherit rpm
