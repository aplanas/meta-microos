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

PV = "1.0+git4"

RPM_NAME = "combustion-1.0+git4-1.1.noarch.rpm"
RPM_HASH = "9bbe843c873e4c2154eb16d3e66a7a528c5a3a3bd2da269ade54d15f39cc08d443d394ce4234265dfb0d1963b0057104e39e3b96ca8775e6c3ed5eea44ca921e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "combustion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ignition-dracut-grub2"

inherit rpm
