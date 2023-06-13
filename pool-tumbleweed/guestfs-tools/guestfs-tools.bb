SUMMARY = "Tools to access and modify virtual machine disk images"
DESCRIPTION = "guestfs-tools is a set of tools that can be used to make batch \
configuration changes to guests, get disk used/free statistics \
(virt-df), perform backups and guest clones, change \
registry/UUID/hostname info, build guests from scratch (virt-builder) \
and much more. \
 \
Virt-alignment-scan scans virtual machines looking for partition \
alignment problems. \
 \
Virt-builder is a command line tool for rapidly making disk images \
of popular free operating systems. \
 \
Virt-cat is a command line tool to display the contents of a file in a \
virtual machine. \
 \
Virt-customize is a command line tool for customizing virtual machine \
disk images. \
 \
Virt-df is a command line tool to display free space on virtual \
machine filesystems.  Unlike other tools, it doesn’t just display the \
amount of space allocated to a virtual machine, but can look inside \
the virtual machine to see how much space is really being used.  It is \
like the df(1) command, but for virtual machines, except that it also \
works for Windows virtual machines. \
 \
Virt-diff shows the differences between virtual machines. \
 \
Virt-edit is a command line tool to edit the contents of a file in a \
virtual machine. \
 \
Virt-filesystems is a command line tool to display the filesystems, \
partitions, block devices, LVs, VGs and PVs found in a disk image \
or virtual machine.  It replaces the deprecated programs \
virt-list-filesystems and virt-list-partitions with a much more \
capable tool. \
 \
Virt-format is a command line tool to erase and make blank disks. \
 \
Virt-get-kernel extracts a kernel/initrd from a disk image. \
 \
Virt-inspector examines a virtual machine and tries to determine the \
version of the OS, the kernel version, what drivers are installed, \
whether the virtual machine is fully virtualized (FV) or \
para-virtualized (PV), what applications are installed and more. \
 \
Virt-log is a command line tool to display the log files from a \
virtual machine. \
 \
Virt-ls is a command line tool to list out files in a virtual machine. \
 \
Virt-make-fs is a command line tool to build a filesystem out of \
a collection of files or a tarball. \
 \
Virt-resize can resize existing virtual machine disk images. \
 \
Virt-sparsify makes virtual machine disk images sparse (thin-provisioned). \
 \
Virt-sysprep lets you reset or unconfigure virtual machines in \
preparation for cloning them. \
 \
Virt-tail follows (tails) a log file within a guest, like 'tail -f'."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-1.50.1-1.1.aarch64.rpm"
RPM_HASH = "6e4e0cb39393a17c45ea65bb613af49c71c3d6e982fc56dcfb39b34957078868848ed1c09fada357621b605e8b03e52ff06a641e4f6982c917f0e0b617bb58f8"

RPROVIDES:${PN} += "config(guestfs-tools) \
guestfs-tools \
guestfs-tools(aarch-64)"

RDEPENDS:${PN} += "curl \
gpg2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libguestfs.so.0()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libosinfo-1.0.so.0()(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.0.5)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.6)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_1.7.0)(64bit) \
libpcre2-8.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.1.5)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
xz"

inherit rpm
