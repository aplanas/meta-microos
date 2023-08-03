SUMMARY = "SELinux policy sandbox"
DESCRIPTION = "SELinux sandbox policy used for the policycoreutils-sandbox package"
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-sandbox-20230728-1.1.noarch.rpm"
RPM_HASH = "101ea4fab4a4bb78c8246996a1e63683e1ebdc6b72effc23081cf163df53a98c9a30ae826ec5ab0857ad70c01a21e3f81fe95dd622fa0d4856d193e34972f7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-sandbox"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy-targeted"

inherit rpm
