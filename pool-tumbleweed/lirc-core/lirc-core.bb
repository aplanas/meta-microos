SUMMARY = "LIRC core, always needed to run LIRC"
DESCRIPTION = "The LIRC core contains the lircd daemons, the devinput and \
default driver and most of the applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-core-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "c84c0bbda2dc31eb10327a517b41b7a944cd500d3321702e80f814c8f0fa89e683b96f4a9c24a96b5ccbd7008110f8cd6f6177e5670d740bff545208f3d1f65c"

RPROVIDES:${PN} += "config-lirc-core \
lirc \
lirc-core"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libirrecord.so.0 \
liblirc-client.so.0 \
liblirc-driver.so.0 \
liblirc.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
python-abi \
shadow \
systemd \
typelib-GLib \
typelib-GObject \
typelib-Gtk \
typelib-Vte"

inherit rpm
