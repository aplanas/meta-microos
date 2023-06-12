SUMMARY = "KIWI - host requirements for disk images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build disk images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-disk-images-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "9ad88c8d2b97ca048d7999f438936b9031b54a5cdeaece83d0bbc8fa1c67f012317bbfbf533a4b55db7927a4a37f30a53f2db2f96bee5e222f41204773df4c7c"

RPROVIDES:${PN} += "kiwi-image-oem-requires \
kiwi-image-vmx-requires \
kiwi-image:oem \
kiwi-image:vmx \
kiwi-systemdeps-disk-images \
kiwi-systemdeps-disk-images(aarch-64)"
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
