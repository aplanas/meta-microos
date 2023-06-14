SUMMARY = "LIRC core, always needed to run LIRC"
DESCRIPTION = "The LIRC core contains the lircd daemons, the devinput and \
default driver and most of the applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-core-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "3f8a6e15264e6263940bcbb1a10c15f544be9c6c4f6e164c97bc8103bbe7f63a45c0e25aab5646637fb2e134201c68619def2d11602a688bbf4bbe4caa33c418"

RPROVIDES:${PN} += "config-lirc-core \
lirc \
lirc-core"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3 \
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
