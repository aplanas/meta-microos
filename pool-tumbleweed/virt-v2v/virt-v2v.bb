SUMMARY = "Tools to convert a virtual machine to run on KVM"
DESCRIPTION = "Virt-v2v converts a single guest from a foreign hypervisor to run on \
KVM.  It can read Linux and Windows guests running on VMware, Xen, \
Hyper-V and some other hypervisors, and convert them to KVM managed by \
libvirt, OpenStack, oVirt, Red Hat Virtualisation (RHV) or several \
other targets.  It can modify the guest to make it bootable on KVM and \
install virtio drivers so it will run quickly."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "virt-v2v-2.0.7-2.3.aarch64.rpm"
RPM_HASH = "07fc1e7c5c4ba7f94c3e000aace0de519b6c02ad948003469a1cdce1aeff88f8f81e029bbe8909397112d6ea935b1a21d0bbcda67955c22c07b57dc381f56307"

RPROVIDES:${PN} += "virt-v2v \
virt-v2v(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/gzip \
/usr/bin/qemu-nbd \
/usr/bin/virsh \
curl \
guestfs-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libguestfs.so.0()(64bit) \
libguestfs0 \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libnbd.so.0()(64bit) \
libnbd.so.0(LIBNBD_1.0)(64bit) \
libnbd.so.0(LIBNBD_1.12)(64bit) \
libnbd.so.0(LIBNBD_1.2)(64bit) \
libnbd.so.0(LIBNBD_1.4)(64bit) \
libnbd.so.0(LIBNBD_1.6)(64bit) \
libnbd.so.0(LIBNBD_1.8)(64bit) \
libosinfo-1.0.so.0()(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.0.5)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.6)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_1.7.0)(64bit) \
libpcre2-8.so.0()(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.0.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.1.4)(64bit) \
libvirt.so.0(LIBVIRT_0.1.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.9)(64bit) \
libvirt.so.0(LIBVIRT_0.2.0)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.2.3)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.2)(64bit) \
libvirt.so.0(LIBVIRT_0.3.3)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.4.2)(64bit) \
libvirt.so.0(LIBVIRT_0.5.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.0)(64bit) \
libvirt.so.0(LIBVIRT_0.7.1)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.10)(64bit) \
libvirt.so.0(LIBVIRT_0.9.3)(64bit) \
libvirt.so.0(LIBVIRT_0.9.8)(64bit) \
libvirt.so.0(LIBVIRT_1.2.7)(64bit) \
libvirt.so.0(LIBVIRT_1.2.8)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
openssh-clients \
ovmf \
unzip"

inherit rpm
