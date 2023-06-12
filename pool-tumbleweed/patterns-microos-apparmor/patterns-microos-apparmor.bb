SUMMARY = "Apparmor Support"
DESCRIPTION = "Packages required to enable Apparmor on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-apparmor-5.0-70.1.aarch64.rpm"
RPM_HASH = "1099307fe4be4bb8ee11e26c0e3a8d1f4ea642f44a70052e34c2b564d4b49be84b1938e74ccf28569f3d0c1f3c2a5ce71f769de5b8e435e7fba224fa2e85d568"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-apparmor \
patterns-microos-apparmor(aarch-64)"
RDEPENDS:${PN} += "apparmor-parser \
apparmor-profiles"

inherit rpm
