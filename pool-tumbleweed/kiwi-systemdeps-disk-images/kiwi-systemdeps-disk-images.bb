SUMMARY = "KIWI - host requirements for disk images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build disk images"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-disk-images-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "37387235081ebeff63595f8adff4c9bb51cf115826860e256ac4de23b2fe5668d19290c824a6295099cc4774c1388330c8fafd6a659d8d6bf2cb41bac51c4c56"

RPROVIDES:${PN} += "kiwi-image-oem \
kiwi-image-oem-requires \
kiwi-image-vmx \
kiwi-image-vmx-requires \
kiwi-systemdeps-disk-images"

RDEPENDS:${PN} += "cryptsetup \
gptfdisk \
kiwi-systemdeps-bootloaders \
kiwi-systemdeps-filesystems \
kiwi-systemdeps-iso-media \
kpartx \
lvm2 \
mdadm \
parted \
util-linux \
util-linux-systemd"

inherit rpm
