SUMMARY = "Transactional Updates with btrfs and snapshots"
DESCRIPTION = "transactional-update is a tool to update a system in an atomic \
way with zypper, btrfs and snapshots."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.2.1"

RPM_NAME = "transactional-update-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "8d372e0bad694753594dd4e5c09e2e5e190d5d3283938e06dc6c9e8d29ba4e76668df798c2f783c01e146488786b0e5168feeb51c3bf50c2c49c9d848f1f9ebe"

RPROVIDES:${PN} += "transactional-update \
transactional-update(aarch-64)"
RDEPENDS:${PN} += "(compat-usrmerge-tools or rpmlib(X-CheckUnifiedSystemdir)) \
/bin/bash \
/bin/sh \
/usr/bin/bc \
dracut-transactional-update \
logrotate \
lsof \
psmisc \
tukit \
zypper"

inherit rpm
