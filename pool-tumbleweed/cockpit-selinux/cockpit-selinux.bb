SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-selinux-298-1.1.noarch.rpm"
RPM_HASH = "63b3599500074183ee8359755b05d8a9e742250d625246c5fae4feefb5f20d6c51744c5bad7761c1d1dd5fa39d912ee4894550e2bfc7a142c8e28aa54ca75a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
policycoreutils-python-utils \
setroubleshoot-server"

inherit rpm
