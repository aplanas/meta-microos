SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-selinux-293-1.1.noarch.rpm"
RPM_HASH = "e57b40caf00e074dfc484249d2c2e3f63b9ca0ddf94e2ba9693610e41df0c64804da290bc80ea69395ff9248b19b733cd6fad63ae90fffd04cf6209bc54bc66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
policycoreutils-python-utils \
setroubleshoot-server"

inherit rpm
