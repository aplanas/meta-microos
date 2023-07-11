SUMMARY = "Tools to convert a virtual machine to run on KVM"
DESCRIPTION = "Virt-v2v converts a single guest from a foreign hypervisor to run on \
KVM.  It can read Linux and Windows guests running on VMware, Xen, \
Hyper-V and some other hypervisors, and convert them to KVM managed by \
libvirt, OpenStack, oVirt, Red Hat Virtualisation (RHV) or several \
other targets.  It can modify the guest to make it bootable on KVM and \
install virtio drivers so it will run quickly."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "virt-v2v-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "4c435a9e80b6904303d64c079afd87508d843bd77e00ae35134cace723c317ef719b450afed4c5eacb6cb5508a0ae6aaf9a205893caea29e6ba71ecb76e61cc1"

RPROVIDES:${PN} += "virt-v2v"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/gzip \
/usr/bin/qemu-nbd \
/usr/bin/virsh \
curl \
guestfs-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libguestfs.so.0 \
libguestfs0 \
libjansson.so.4 \
libm.so.6 \
libnbd.so.0 \
libosinfo-1.0.so.0 \
libpcre2-8.so.0 \
libvirt.so.0 \
libxml2.so.2 \
openssh-clients \
ovmf \
unzip"

inherit rpm
