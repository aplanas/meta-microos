SUMMARY = "AppArmor"
DESCRIPTION = "AppArmor is an application security framework that provides mandatory access control for programs. It protects from exploitation of software flaws and compromised systems. It offers an advanced tool set that automates the development of per-program application security without requiring additional knowledge."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-apparmor-20200505-41.1.aarch64.rpm"
RPM_HASH = "af379a9c8aee0c7c174b2ea73b211108d2ac8dfc46798e5491dc7b2a43391027da8488620a1063b6b6a0143c431a989c708bb55b875ec8d2c6c391f3c832b534"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-apparmor \
patterns-openSUSE-apparmor"

RDEPENDS:${PN} += "apparmor-abstractions \
apparmor-parser \
apparmor-profiles \
audit \
pattern-"

inherit rpm
