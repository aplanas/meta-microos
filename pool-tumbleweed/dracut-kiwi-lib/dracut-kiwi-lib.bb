SUMMARY = "KIWI - Dracut kiwi Library"
DESCRIPTION = "This package contains a collection of methods to provide a library \
for tasks done in other kiwi dracut modules"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "dracut-kiwi-lib-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "fb59dface9072471d4d7083fe58203a8dee2f48c7b9bc58f949bcc295868b58baa3d971c974f14b68ce8eb4dda5028b4ac52f9f7d46315ca524c9e16d7c9918b"

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
