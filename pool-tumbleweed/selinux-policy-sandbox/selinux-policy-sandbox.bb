SUMMARY = "SELinux policy sandbox"
DESCRIPTION = "SELinux sandbox policy used for the policycoreutils-sandbox package"
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-sandbox-20230622-1.1.noarch.rpm"
RPM_HASH = "8ed95f7e65e1925fd8640eabd92bb25ac8a4230c1738140c5503dbb53d740207d51330482ae390e58910b66347b33f0e715864d995ad21efa31b555e0e40407e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-sandbox"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy-targeted"

inherit rpm
