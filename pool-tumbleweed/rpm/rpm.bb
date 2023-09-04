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

RPM_NAME = "rpm-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "9aacdb3524cb41045dc7c5f647b236e204e38127ec2356ccc7958c627f4b88eb35c3ebab7a6970a6fbe07f563f4368bd39211e748cef7f77ec25983c344fb0f4"

RPROVIDES:${PN} += "librpm.so.9 \
librpmio.so.9 \
librpmsign.so.9 \
rpm \
rpminst"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
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
