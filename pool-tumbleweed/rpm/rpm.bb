SUMMARY = "The RPM Package Manager"
DESCRIPTION = "RPM Package Manager is the main tool for managing the software packages \
of the SUSE Linux distribution. \
 \
RPM can be used to install and remove software packages. With rpm, it \
is easy to update packages.  RPM keeps track of all these manipulations \
in a central database.	This way it is possible to get an overview of \
all installed packages.  RPM also supports database queries."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "24c92681aba96e26d928097e3cc66f85c758060aae5b5a35548a74eee1ec18fa6956daf2998165878c674e3c503e75d31e74eab63187377284eee8ebbdc14b40"

RPROVIDES:${PN} += "librpm.so.9 \
librpmio.so.9 \
librpmsign.so.9 \
rpm \
rpminst"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/awk \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libgcrypt.so.20 \
liblua5.4.so.5 \
liblzma.so.5 \
libpopt.so.0 \
libselinux.so.1 \
libz.so.1 \
libzstd.so.1 \
rpm-config-SUSE"

inherit rpm
