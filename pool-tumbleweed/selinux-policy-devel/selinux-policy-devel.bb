SUMMARY = "SELinux policy devel"
DESCRIPTION = "SELinux policy development and man page package"
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-devel-20230622-1.1.noarch.rpm"
RPM_HASH = "4afb3b92be3d0658af66e471c786abeb213b4c750dff53c5f0409b9ac8e611252ec037c95d4f1393f309e548199280004ec1de98b6bf14661296e58bb7eb4537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-devel"

RDEPENDS:${PN} += "/usr/bin/make \
checkpolicy \
m4 \
selinux-policy"

inherit rpm
