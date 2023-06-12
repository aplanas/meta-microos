SUMMARY = "SELinux policy documentation"
DESCRIPTION = "SELinux policy documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-doc-20230425-1.1.noarch.rpm"
RPM_HASH = "6eab4f282f867cc167ec4b186e27b8e50174ded3d63443477716e8aa4bf011d53aa52bcb867a3974a45965a2898c74c04affbc3f7ea3fc41ba52fbe83fc04263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-doc"
RDEPENDS:${PN} += "/usr/bin/xdg-open \
selinux-policy"

inherit rpm
