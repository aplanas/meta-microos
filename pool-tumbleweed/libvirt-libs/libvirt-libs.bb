SUMMARY = "Client side libraries for libvirt"
DESCRIPTION = "Shared libraries for accessing the libvirt daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-libs-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "18b7ba82866e96cab2cfbb8387ec65d395675be202b5fe222a516f0c0b33526901d5f370f04caff61a1970f1ce81dc156525300fcb0024da72ca1320947b57c3"

RPROVIDES:${PN} += "config-libvirt-libs \
libvirt-admin.so.0 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
cyrus-sasl-digestmd5 \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libapparmor.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcurl.so.4 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libm.so.6 \
libnl-3.so.200 \
libnuma.so.1 \
libsasl2.so.3 \
libselinux.so.1 \
libssh.so.4 \
libssh2.so.1 \
libtirpc.so.3 \
libxml2.so.2 \
libyajl.so.2"

inherit rpm
