SUMMARY = "A userspace daemon that handles the LIO TCM-User backstore"
DESCRIPTION = "LIO is the SCSI target in the Linux kernel. It is entirely kernel \
code, and allows exported SCSI logical  units (LUNs) to be backed \
by regular files or block devices. But, if we want to get fancier with \
the capabilities of the device we're emulating, the kernel is not \
necessarily the right place. While there are userspace libraries for \
compression, encryption, and clustered storage solutions like \
Ceph or Gluster, these are not accessible from the kernel. \
 \
The TCMU userspace-passthrough backstore allows a userspace process to \
handle requests to a LUN. But since the kernel-user interface that \
TCMU provides must be fast and flexible, it is complex enough that \
we'd like to avoid each  userspace handler having to write boilerplate \
code. \
 \
tcmu-runner handles the messy details of the TCMU interface -- UIO, \
netlink, pthreads, and DBus -- and exports a more friendly C plugin \
module API. Modules using this API are called 'TCMU handlers'. Handler \
authors can write code just to handle the SCSI commands as desired, \
and can also link with whatever userspace libraries they like."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "tcmu-runner-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "d44699400abeeb0e74637e0e8f7a310b189fee2294cc93b9045b426596d86e13d359b0403ba3795492f9bf29a160d1c2f9073a21e20dd0b658456341332d75d5"

RPROVIDES:${PN} += "config-tcmu-runner \
tcmu-runner"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkmod.so.2 \
libtcmalloc.so.4 \
libtcmu.so.2 \
libtcmu2 \
libz.so.1 \
logrotate \
systemd"

inherit rpm
