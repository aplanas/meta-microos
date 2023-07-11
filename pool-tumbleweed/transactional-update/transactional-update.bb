SUMMARY = "Transactional Updates with btrfs and snapshots"
DESCRIPTION = "transactional-update is a tool to update a system in an atomic \
way with zypper, btrfs and snapshots."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "transactional-update-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "6d0f2b4dc5073c230867def3c2463214ed2bfcb6553177a409aaad2d1c766af5b36ad6aca8fe3288e62d7339286224b443c037e306a594f2b81b92dd8e12db94"

RPROVIDES:${PN} += "transactional-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/bc \
/usr/bin/sh \
dracut-transactional-update \
logrotate \
lsof \
psmisc \
tukit \
zypper"

inherit rpm
