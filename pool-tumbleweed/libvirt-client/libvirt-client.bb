SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-client-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "56e4631b8715a2fc9868425de4e8b051e0d3806c11416dc8ad11948e375788bd8a72632b4d170d4c081ea37763baa6f3c0f3c4a767346f360e441cd5785c4f39"

RPROVIDES:${PN} += "libvirt-client"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
cyrus-sasl \
gnutls \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libreadline.so.8 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm
