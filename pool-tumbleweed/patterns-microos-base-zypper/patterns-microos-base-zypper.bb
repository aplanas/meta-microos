SUMMARY = "openSUSE MicroOS using Zypper"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Zypper package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-zypper-5.0-72.1.aarch64.rpm"
RPM_HASH = "c282e0c24be4764bec3f817ff41ec2a0d7ae0a4f85c1369ac3de06c82036187b18dd2fceb4cce79e7cc0e00e67ed0b7c2ec6ac9abc0a8d7c0088745b758ad973"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-zypper"

RDEPENDS:${PN} += "pattern- \
transactional-update \
transactional-update-zypp-config \
zypper \
zypper-needs-restarting"

inherit rpm
