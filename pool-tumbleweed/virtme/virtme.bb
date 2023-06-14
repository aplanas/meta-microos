SUMMARY = "Tools for virtualize the running distro or a rootfs"
DESCRIPTION = "Virtme is a set of tools to run a virtualized Linux kernel that \
uses the host Linux distribution or a rootfs instead of a whole \
disk image. \
 \
Right now it is not really configurable enough for being useful as a \
sort of sandbox."
LICENSE = "GPL-2.0-only"

PV = "0.1.2"

RPM_NAME = "virtme-0.1.2-1.1.noarch.rpm"
RPM_HASH = "188fe4a2efe45568293713d6f21011711631a35b871e929d343bade34344101d69271e75d0def4fcdf060ba00050982360aecc062351b2f08348276bd855303d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-virtme \
python3dist-virtme \
virtme"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
busybox-static \
python-abi \
qemu"

inherit rpm
