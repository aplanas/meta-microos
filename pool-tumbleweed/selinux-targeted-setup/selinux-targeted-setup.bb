SUMMARY = "Helper package for transactional-update with SELinux"
DESCRIPTION = "Helper package for transactional-update to enable SELinux. \
This package should NEVER be installed alone, only by \
transactional-update if required!"
LICENSE = "GPL-2.0-or-later"

PV = "20201215"

RPM_NAME = "selinux-targeted-setup-20201215-3.2.noarch.rpm"
RPM_HASH = "c0ef0c3ae994dfc1b9aad4985513c975f23d8416e0303050c8094303db1319912218780074b2efb56691ca61010b6089db0ecefde948390483fe07e6f4a30aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-targeted-setup"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
selinux-policy-targeted"

inherit rpm
