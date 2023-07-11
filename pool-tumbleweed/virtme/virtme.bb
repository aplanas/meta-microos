SUMMARY = "Tools for virtualize the running distro or a rootfs"
DESCRIPTION = "Virtme is a set of tools to run a virtualized Linux kernel that \
uses the host Linux distribution or a rootfs instead of a whole \
disk image. \
 \
Right now it is not really configurable enough for being useful as a \
sort of sandbox."
LICENSE = "GPL-2.0-only"

PV = "0.1.2"

RPM_NAME = "virtme-0.1.2-1.2.noarch.rpm"
RPM_HASH = "ed6fcd0e68014ee9f43fdf634e845a28415701051193643948a87a59dd08688ccdc6d3d170c74ebbd06140bcfb4f93e8337db8f3d41ca298c71a81b3c25612d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-virtme \
python3dist-virtme \
virtme"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
busybox-static \
python-abi \
qemu"

inherit rpm
