SUMMARY = "Filesystem regression test suite"
DESCRIPTION = "The filesystem regression test suite. Contains around 1500+ specific tests for \
userspace and kernelspace for several linux filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1+git.20230528"

RPM_NAME = "xfstests-1.1.1+git.20230528-1.1.aarch64.rpm"
RPM_HASH = "9b3f5a0aa5dab2d7b95ccfea602bdf98c9c6ae45fc5d4f62bc10027e8738dfa7d67d37fe9682935a7fb30278453e77653cf5c108dfd5339c78e3c6c6767668e0"

RPROVIDES:${PN} += "xfstests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
acl \
attr \
bash \
bc \
bind-utils \
btrfsprogs \
coreutils \
device-mapper \
duperemove \
e2fsprogs \
keyutils \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libaio.so.1 \
libc.so.6 \
libcap-progs \
libgdbm-compat.so.4 \
libhandle.so.1 \
libuuid.so.1 \
lvm \
perl \
quota \
xfsdump \
xfsprogs \
xz"

inherit rpm
