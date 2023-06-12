SUMMARY = "Static cluster configuration database"
DESCRIPTION = "Genders is a static cluster configuration database used for cluster \
configuration management.  It is used by a variety of tools and \
scripts for management of large clusters.  The genders database is \
typically replicated on every node of the cluster. It describes the \
layout and configuration of the cluster so that tools and scripts can \
sense the variations of cluster nodes. By abstracting this information \
into a plain text file, it becomes possible to change the \
configuration of a cluster by modifying only one file."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "28a5960ec915121543a94d054de63edc78982e89261854c11effe3eace456909357dca8948e52009fec93cd0f2abbc6dec4f7d3115ea19d91ce4ce50aa96fbfe"

RPROVIDES:${PN} += "genders \
genders(aarch-64)"
RDEPENDS:${PN} += "genders-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgenders.so.0()(64bit)"

inherit rpm
