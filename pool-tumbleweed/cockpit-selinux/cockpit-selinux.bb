SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-selinux-298-2.1.noarch.rpm"
RPM_HASH = "9bc4694fd68f4bc555f742793cebc05e544ba6b63402a1d4eb81da62180f8414c8a7686debdd0d1e7339d44aee74e8aca15cfe23b45ed26f13758635e8fdf66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
policycoreutils-python-utils \
setroubleshoot-server"

inherit rpm
