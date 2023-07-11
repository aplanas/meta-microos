SUMMARY = "Tool to create SUSE Linux installation ISOs"
DESCRIPTION = "This is a tool to create SUSE Linux installation ISOs."
LICENSE = "GPL-3.0+"

PV = "2.10"

RPM_NAME = "mksusecd-2.10-1.2.aarch64.rpm"
RPM_HASH = "a6c5f030a572852e08a21e2ea3c43843593c4217c9127f35c245fc1962b084f7d89d3e1fb7bc1dfe57497fdc0af01216a14ac389ed09b7646a3c91ba9dbac44c"

RPROVIDES:${PN} += "mksusecd"

RDEPENDS:${PN} += "/usr/bin/perl \
checkmedia \
createrepo-implementation \
dosfstools \
gpg2 \
libc.so.6 \
libuuid.so.1 \
mkisofs \
mtools \
squashfs \
xz"

inherit rpm
