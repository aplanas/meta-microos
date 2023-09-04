SUMMARY = "AppArmor"
DESCRIPTION = "AppArmor is an application security framework that provides mandatory access control for programs. It protects from exploitation of software flaws and compromised systems. It offers an advanced tool set that automates the development of per-program application security without requiring additional knowledge."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-apparmor-20200505-42.1.aarch64.rpm"
RPM_HASH = "9ffa37f392d95a30b8da8483277631d44a4fc3f86c82f24769aef465b98ae94bed217d5b1d5bf97b7dcc165bb31126830cc26396d14ed6ab8d16b32c635941de"

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
