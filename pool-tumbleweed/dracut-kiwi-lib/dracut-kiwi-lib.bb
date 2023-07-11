SUMMARY = "KIWI - Dracut kiwi Library"
DESCRIPTION = "This package contains a collection of methods to provide a library \
for tasks done in other kiwi dracut modules"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-lib-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "8eb90ff66eee7b4f9245bc74556152e4febfe7f1e8ed6d420a0789f2e7c69004190236227e6741d9c351bebb89cda4b1b9ad6231a384d8d3d6cd5bf50696868c"

RPROVIDES:${PN} += "dracut-kiwi-lib"

RDEPENDS:${PN} += "/usr/bin/bash \
bc \
btrfsprogs \
coreutils \
cryptsetup \
curl \
device-mapper \
dialog \
e2fsprogs \
gptfdisk \
grep \
lvm2 \
mdadm \
pv \
util-linux \
util-linux-systemd \
xfsprogs \
xz"

inherit rpm
