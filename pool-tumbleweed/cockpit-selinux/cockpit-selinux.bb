SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-selinux-276.1-4.4.noarch.rpm"
RPM_HASH = "b2394eb27148254499376783b6255ea89d0ea16db6d53d1a92196d6c3028610b0cb309bcfe3b78ab3c6cfda288f7e27b7a9f9ee4bdb630e71bb19b3e930ccb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux \
metainfo() \
metainfo(org.cockpit-project.cockpit-selinux.metainfo.xml)"
RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
policycoreutils-python-utils \
setroubleshoot-server"

inherit rpm
