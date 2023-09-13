SUMMARY = "Client side libraries for libvirt"
DESCRIPTION = "Shared libraries for accessing the libvirt daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-libs-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "0bd399e7cce1a209bb5c3f46d5411c2095b920ca191747d11ea1e7f2540ee5de0eaad5a4126d40d8f1a8b3b81aa8668786566773de4f19ca10abfac6767cfe6b"

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
