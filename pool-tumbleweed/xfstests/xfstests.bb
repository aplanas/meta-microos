SUMMARY = "Filesystem regression test suite"
DESCRIPTION = "The filesystem regression test suite. Contains around 1500+ specific tests for \
userspace and kernelspace for several linux filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1+git.20220820"

RPM_NAME = "xfstests-1.1.1+git.20220820-1.4.aarch64.rpm"
RPM_HASH = "19622447cad7c17352ad3285da2c391e186b20d7fce7c2cd5a6f20aa2ecdcd803c71b3a36d5701b0fdf7d6b65667a000c2435a091808507de4adc3c667b80f0d"

RPROVIDES:${PN} += "xfstests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
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
