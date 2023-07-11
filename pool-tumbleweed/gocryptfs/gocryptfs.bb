SUMMARY = "Encrypted overlay filesystem written in Go"
DESCRIPTION = "gocryptfs is built on top the excellent go-fuse FUSE library. \
This project was inspired by EncFS and strives to fix its \
security issues while providing good performance. \
 \
gocryptfs uses file-based encryption that is implemented as a \
mountable FUSE filesystem. Each file in gocryptfs is stored as \
one corresponding encrypted file on disk."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "gocryptfs-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "d2e2cf85bc5902d3d74f5eabe002837f2cfce3d36320da4a8a15f4fcd0d45d474feaa2b1405e6fad0d764d0c1ca53c87eb89242433a85480d877490e849d01cb"

RPROVIDES:${PN} += "gocryptfs"

RDEPENDS:${PN} += "fuse \
libc.so.6 \
libcrypto.so.3 \
util-linux-systemd"

inherit rpm
