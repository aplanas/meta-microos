SUMMARY = "Runtime library of libguestfs"
DESCRIPTION = "Shared object library for libguestfs tools which are used to access \
and modify virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs0-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "775488010bd04763de8986fed63952d73b019568ce7032f63fa76495cea57168971118d590f297bba9062bb8851133f7660c76a40e0baf3666ced5b742281acf"

RPROVIDES:${PN} += "libguestfs.so.0()(64bit) \
libguestfs0 \
libguestfs0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/qemu-system-aarch64 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.4)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libpcre2-8.so.0()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.5.0)(64bit) \
libvirt.so.0(LIBVIRT_0.7.1)(64bit) \
libvirt.so.0(LIBVIRT_0.9.4)(64bit) \
libvirt.so.0(LIBVIRT_1.2.7)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.8.0)(64bit)"

inherit rpm
