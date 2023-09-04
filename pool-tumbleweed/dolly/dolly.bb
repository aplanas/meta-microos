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

RPM_NAME = "dolly-0.64.2-1.8.aarch64.rpm"
RPM_HASH = "548fd94dd261a86b047a66fdd050694907a5e5139f7450c36629a325e8239acb2dea8ed68016d2390a2619bebc60cd4f778f3431600859ec3d6fe0d45e31ed79"

RPROVIDES:${PN} += "config-dolly \
dolly"

RDEPENDS:${PN} += "/usr/bin/sh \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
