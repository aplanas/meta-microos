SUMMARY = "SELinux Support"
DESCRIPTION = "This are packages which are required to enable SELinux on openSUSE MicroOS"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-selinux-5.0-73.1.aarch64.rpm"
RPM_HASH = "f144d3b6fb6d84233efef89eac98a48b80d67f305bdb835f891b6502999c3f1e9d4999e0ea78936e266e9b5036a123b0e6539f0b49d84ff2aae3fa97d2a4a890"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-selinux"

RDEPENDS:${PN} += "container-selinux \
policycoreutils \
selinux-policy-targeted \
selinux-tools"

inherit rpm
