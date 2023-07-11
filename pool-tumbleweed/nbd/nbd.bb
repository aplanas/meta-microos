SUMMARY = "Network Block Device Server and Client Utilities"
DESCRIPTION = "This package contains nbd-server. It is the server backend for the nbd \
network block device driver that's in the Linux kernel. \
 \
nbd can be used to have a filesystem stored on another machine. It does \
provide a block device, not a file system; so unless you put a \
clustering filesystem on top of it, you can't access it simultaneously \
from more than one client. Use NFS or a real cluster FS (such as \
ocfs2) if you want to do this. nbd-server can export a file (which may \
contain a filesystem image) or a partition. Swapping over nbd is \
possible as well, though it's said not to be safe against OOM and \
should not be used for that case. nbd-server also has a copy-on-write \
mode where changes are saved to a separate file and thrown away when \
the connection closes. \
 \
The package also contains the nbd-client tools, which you need to \
configure the nbd devices on the client side."
LICENSE = "GPL-2.0-or-later"

PV = "3.25"

RPM_NAME = "nbd-3.25-1.1.aarch64.rpm"
RPM_HASH = "71411320d21f59566554d4c41d42be09385635ef306895d6d9dc5c8db547b006ae4f4c3f5ae6afec66662f717eb2a1cec8a93b6c9c6858116699d12c153f3942"

RPROVIDES:${PN} += "config-nbd \
nbd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
systemd"

inherit rpm
