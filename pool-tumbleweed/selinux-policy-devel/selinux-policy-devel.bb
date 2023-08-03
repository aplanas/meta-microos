SUMMARY = "SELinux policy devel"
DESCRIPTION = "SELinux policy development and man page package"
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-devel-20230728-1.1.noarch.rpm"
RPM_HASH = "5a8d8a2aea015638bcd3f5326ec3da7f6a4478cdc8144350e95532409c33bfc746726338820b262fbdf53b991fc213df72b906df2af4a3ec579618cab7f3ca06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-devel"

RDEPENDS:${PN} += "/usr/bin/make \
checkpolicy \
m4 \
selinux-policy"

inherit rpm
