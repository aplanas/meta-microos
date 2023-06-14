SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-lock-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "30fbcd57c8425e26dc5aefe4e30e80fd432394b4ffa38e4ca03371b7cde71004e25df65ca0368567982de47373e903cf72e409b5dd25ff6102b6b55d61bc8aab"

RPROVIDES:${PN} += "config-libvirt-daemon-lock \
libvirt-daemon-lock"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
