SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-selinux-276.1-4.3.noarch.rpm"
RPM_HASH = "8db12bf26d7ba68abbbab0e5792772c5f7e259e0dd624829c600ff9bef6af34af881422bb1ef607e2af1f96c555dad0e3a208e0291a8a5e399a768d721b41c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux metainfo() metainfo(org.cockpit-project.cockpit-selinux.metainfo.xml)"
RDEPENDS:${PN} += "cockpit-bridge cockpit-shell policycoreutils-python-utils setroubleshoot-server"

inherit rpm
