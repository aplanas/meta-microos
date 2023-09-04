SUMMARY = "Apparmor Support"
DESCRIPTION = "Packages required to enable Apparmor on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-apparmor-5.0-73.1.aarch64.rpm"
RPM_HASH = "7e4032496ae61ba28dde27f8afe82c63037252c28f6e6855202148262895fbaaf5694597b35724c4d69575cb98e38712c656b38b9edbd9513de8726020cae34e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-apparmor"

RDEPENDS:${PN} += "apparmor-parser \
apparmor-profiles"

inherit rpm
