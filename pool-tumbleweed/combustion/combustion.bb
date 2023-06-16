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

PV = "1.0+git2"

RPM_NAME = "combustion-1.0+git2-1.2.noarch.rpm"
RPM_HASH = "c91b80556e326ed8d6b4373fabcd99c63ae9c35c4b6fa06e9ea93a1d179a59d40d047367339ad6f70dd46a3901ed6b37bf9f5ffa6d918b816969bde7f5bbc62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "combustion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ignition-dracut-grub2"

inherit rpm
