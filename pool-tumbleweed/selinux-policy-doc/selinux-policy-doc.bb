SUMMARY = "SELinux policy documentation"
DESCRIPTION = "SELinux policy documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-doc-20230622-1.1.noarch.rpm"
RPM_HASH = "79efe3282d6264493995192ea55bee8f9b3eb21b8e5ca042426d1d6268ed598d6517ca9097c9be85db2f2893437c734cf37b6d1e0967aeb887781930482ab940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-doc"

RDEPENDS:${PN} += "/usr/bin/xdg-open \
selinux-policy"

inherit rpm
