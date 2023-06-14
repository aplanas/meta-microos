SUMMARY = "AppArmor profiles for Akonadi"
DESCRIPTION = "This package contains AppArmor profiles for Akonadi."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-apparmor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d4862804441b326b281dc8b7c00cdbd0b1cc39d867c7769c8bee49a8c402deaeebb1c153287b0c3399f26876f5d0c0672ee27b7f0ffc963a24a6713f28ad275d"

RPROVIDES:${PN} += "akonadi-server-apparmor \
config-akonadi-server-apparmor"

RDEPENDS:${PN} += "/bin/sh \
apparmor-abstractions"

inherit rpm
