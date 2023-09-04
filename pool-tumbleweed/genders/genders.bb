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

RPM_NAME = "genders-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "ddf9df3c90b93dca0e9925fc797e73447cff9264aaa98cd11b29af4bfa743dd6d2ee57bb429798f7ffb5121e622b53d136c7c64d6fb1c50ed6c756b87c287350"

RPROVIDES:${PN} += "genders"

RDEPENDS:${PN} += "genders-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0"

inherit rpm
