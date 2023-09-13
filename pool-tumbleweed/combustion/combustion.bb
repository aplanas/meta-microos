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

PV = "1.2+git5"

RPM_NAME = "combustion-1.2+git5-1.1.noarch.rpm"
RPM_HASH = "c652f25409721767ac1a1c0ec64f89ca472a6685151047ef831f2caa8139f3b31573da58eefc3f4e9454db02fe468f5baa72e3861d51877ee60fb7a774f879f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "combustion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
