SUMMARY = "XFS scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of metadata \
on xfs filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "xfsprogs-scrub-6.3.0-1.2.aarch64.rpm"
RPM_HASH = "c84350d12663a34cd9166e72bde29491df0d9a47ee99c1bcac8e6d36c1925ce0b799353d76e4c1e1f68ee76daece600195521f4ef7e62e434c3d31a751b70fff"

RPROVIDES:${PN} += "xfsprogs-scrub"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
xfsprogs"

inherit rpm
