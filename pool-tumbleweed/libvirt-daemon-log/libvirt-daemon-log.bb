SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-log-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "a0268dfd6885db5e9966cbb11acb9f3bc3ae64fca47c55ff77f40ea77c3d49a941f558823796e46bbc50b65c58ee1e4e8e8ad5e4a53ecee1e7d21fe70dfa5750"

RPROVIDES:${PN} += "config-libvirt-daemon-log \
libvirt-daemon-log"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
