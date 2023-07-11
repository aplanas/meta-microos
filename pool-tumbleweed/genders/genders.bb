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

RPM_NAME = "genders-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "ee5fbb54dc3631ba165525b4d2aefd64cb57de8cbb71be2297d04dd73cdbda2b6a50f2e5ffc6d9995eb5f19dad79f1cd91ca490ff8724475cf8012a17519ede9"

RPROVIDES:${PN} += "genders"

RDEPENDS:${PN} += "genders-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0"

inherit rpm
