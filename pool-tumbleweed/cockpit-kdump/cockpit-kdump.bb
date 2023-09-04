SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-kdump-298-1.1.noarch.rpm"
RPM_HASH = "95de6242eab87e553b944baf38cd88677afbe7945d4834219a37d76a6c607305a8052d435438b8a2d1bfb14a074724689b817438cf5c15bba0394dbaceeaec2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
kexec-tools"

inherit rpm
