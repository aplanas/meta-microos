SUMMARY = "KIWI - host requirements for disk images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build disk images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-disk-images-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "1bafe98e2b4f253d548720920d0a2ce9fbd1f4ccd814af25eeb5aef947ae1830bc82220f760ca223506d021c43d65dd70628f06ab4c0e6fae8a20a38cd39aa0b"

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
