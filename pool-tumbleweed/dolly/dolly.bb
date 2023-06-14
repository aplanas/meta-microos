SUMMARY = "Tool for cloning data of one machine to other machines"
DESCRIPTION = "Dolly is used to clone data of one machine to (possibly many) \
other machines. It can distribute image files (even gnu-zipped), \
partitions or whole hard disk drives to other partitions or \
hard disk drives. As it forms a 'virtual TCP ring' to distribute \
data, it works best with fast switched networks. \
 \
As dolly can clone whole partitions block-wise, it works for \
most filesystems, including the types for Linux, Windows, Oberon, \
Solaris."
LICENSE = "GPL-2.0-only"

PV = "0.64.2"

RPM_NAME = "dolly-0.64.2-1.6.aarch64.rpm"
RPM_HASH = "35c05999d1b05a172de62a78f628b82536c3847c114943324ec58e6097c99eebc308acc1456e871b301220a1330818f152135e99fae76367a6353f43d3dfb4e6"

RPROVIDES:${PN} += "config-dolly \
dolly"

RDEPENDS:${PN} += "/bin/sh \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
