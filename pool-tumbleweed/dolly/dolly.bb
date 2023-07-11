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

RPM_NAME = "dolly-0.64.2-1.7.aarch64.rpm"
RPM_HASH = "359490dd33e1b2dad9e2a781357c9889b0660fe4034cf5eb59a58ac88790aa0c1f214761ad5652062b2e07430c98ddaba345e0a2a19dd157101f08c4d0dd4d09"

RPROVIDES:${PN} += "config-dolly \
dolly"

RDEPENDS:${PN} += "/usr/bin/sh \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
