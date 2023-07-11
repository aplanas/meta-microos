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

RPM_NAME = "guestfs-tools-1.50.1-1.2.aarch64.rpm"
RPM_HASH = "e7ccc26ffb16f0925e0cdd6047b0743aa2407662f1e670fed039f3921531a9e9cfcce80cccfe36daa5472494f96f670dac8d9622cf47daafae563c7dcbccaf1f"

RPROVIDES:${PN} += "config-guestfs-tools \
guestfs-tools"

RDEPENDS:${PN} += "curl \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libguestfs.so.0 \
libjansson.so.4 \
liblzma.so.5 \
libm.so.6 \
libosinfo-1.0.so.0 \
libpcre2-8.so.0 \
libtinfo.so.6 \
libvirt.so.0 \
libxml2.so.2 \
xz"

inherit rpm
