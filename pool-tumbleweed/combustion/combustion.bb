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

PV = "1.1+git0"

RPM_NAME = "combustion-1.1+git0-1.1.noarch.rpm"
RPM_HASH = "58f6e0da0ed63a6dc3dfb6360a1c03d79040d8a6a4f83525ae092cdd9b4c96e8411e3c0edfbc3a7ef31e0dc1a886668d186442caa570fbd433f4eec530125100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "combustion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ignition-dracut-grub2"

inherit rpm
