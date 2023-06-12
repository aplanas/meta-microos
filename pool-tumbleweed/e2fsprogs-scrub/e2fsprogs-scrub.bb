SUMMARY = "Ext2fs scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of LVM volumes \
with ext2, ext3, and ext4 filesystems."
LICENSE = "GPL-2.0-only"

PV = "1.47.0"

RPM_NAME = "e2fsprogs-scrub-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "9846cb67555758a6ec2cee82ad8f6efd2237bc94a0c95b3bbe9a96ee6d0601e766132af680ab2fad96fc321177ba289a0581a0664b850df67d85494db983f1fe"

RPROVIDES:${PN} += "config(e2fsprogs-scrub) \
e2fsprogs-scrub \
e2fsprogs-scrub(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
e2fsprogs \
lvm2 \
postfix \
systemd \
util-linux"

inherit rpm
