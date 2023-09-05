SUMMARY = "System for initial configuration of appliances"
DESCRIPTION = "Combustion is a minimal module for dracut, which runs a user provided script on \
the first boot of a transactional system. \
 \
You can use this to create additional files, install packages, set up devices \
or even re-partition the hard disk. The configuration can be provided as a \
shell script, loaded from an external storage media and is run during boot in a \
new system snapshot. On success, the system will directly boot into that new \
snapshot, so that no reboot is needed."
LICENSE = "GPL-2.0-or-later"

PV = "1.2+git2"

RPM_NAME = "combustion-1.2+git2-1.1.noarch.rpm"
RPM_HASH = "20897e73035c3115bb4757bd65abd10f6ccc877ad23aa8c5095eef406fed94d9f15f6ba7a78b30813d10284d99f0c223f23b647cce28e4b2030a29d31175debe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "combustion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
