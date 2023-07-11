SUMMARY = "Tool for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "tukit is a simple tool to make changes to a system in an atomic way \
with btrfs and snapshots."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "tukit-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "85f65f1dd29908f833324868762d6e5d7690c49901f3268555cb96cc0d5336c49124b21e3818b51d46c8aac58d0de86170caddda8a05ba05acc7fbf4d02b4552"

RPROVIDES:${PN} += "tukit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librpm.so.9 \
libselinux.so.1 \
libstdc++.so.6 \
libtukit.so.4 \
libtukit4"

inherit rpm
