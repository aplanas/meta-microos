SUMMARY = "Client side libraries for libvirt"
DESCRIPTION = "Shared libraries for accessing the libvirt daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-libs-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "6581a698809dc359af54696d47f1a5d599d74cba694d74ba162f06ea1dd621f65986a3e539d93f53ce6fe2146f342f82f3bd3f47755083ef40b0070d853da2af"

RPROVIDES:${PN} += "config(libvirt-libs) \
libvirt-admin.so.0()(64bit) \
libvirt-libs \
libvirt-libs(aarch-64) \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
cyrus-sasl-digestmd5 \
ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libapparmor.so.1()(64bit) \
libaudit.so.1()(64bit) \
libc.so.6()(64bit) \
libcap-ng.so.0()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnuma.so.1()(64bit) \
libsasl2.so.3()(64bit) \
libselinux.so.1()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libssh2.so.1()(64bit) \
libtirpc.so.3()(64bit) \
libxml2.so.2()(64bit) \
libyajl.so.2()(64bit)"

inherit rpm
