SUMMARY = "Makes the installation available from a running system"
DESCRIPTION = "This package contains files that allow starting the installer from a \
running (live) system."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "live-net-installer-1.0-20.8.aarch64.rpm"
RPM_HASH = "a1cef37ce8f5918c2192f751dc88167fd8ecd86a205f9580ac676d3105802ba7c9685e224d7399ac020df4f80560fee7cfe8d8218fcafa480e615a283c32e5e1"

RPROVIDES:${PN} += "live-net-installer"

RDEPENDS:${PN} += "/usr/bin/bash \
bcache-tools \
btrfsprogs \
cryptsetup \
device-mapper \
dmraid \
e2fsprogs \
exfatprogs \
fcoe-utils \
mdadm \
multipath-tools \
ntfs-3g \
ntfsprogs \
nvme-cli \
open-iscsi \
quota \
snapper \
util-linux \
xdg-utils \
xfsprogs \
yast2-installation"

inherit rpm
