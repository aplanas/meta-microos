SUMMARY = "Busybox applets replacing selinux-tools"
DESCRIPTION = "This package contains the symlinks to provide selinux-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-selinux-tools-1.36.0-26.3.noarch.rpm"
RPM_HASH = "f93e4fba322e7cf46f1b7da1ab2842d9d75f35aab137cda190a16096cf00913b9b2c6eb394d4209b2d50867931cc47aa2384994666dc2c0802c9dbd9a571ea84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-selinux-tools"
RDEPENDS:${PN} += "busybox"

inherit rpm
