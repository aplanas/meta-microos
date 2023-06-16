SUMMARY = "Tool for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "tukit is a simple tool to make changes to a system in an atomic way \
with btrfs and snapshots."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "tukit-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "23010a02e13201a5a56f32c2ae901ba5b642c39883877255b89134c24cfa4e2376c5d7bd88fecc8d40cf7543be8507351c1b2dadd6d994b198513728e227ea26"

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
