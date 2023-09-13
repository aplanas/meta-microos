SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-selinux-300.1-1.1.noarch.rpm"
RPM_HASH = "50c966b8803076ece7aa5be5e29a0780852819263523ff4ab1c9c827fb93f2cfd60c9990d4655a8416eebcf7bfb36f5d5b29bcdf6bf7c4602cbe388d90d20814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
policycoreutils-python-utils \
setroubleshoot-server"

inherit rpm
