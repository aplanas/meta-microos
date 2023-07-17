SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kinit-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "82d61fdf4c1b74d856508d0d0d749ddb8bf35f74f254988edbaf1ba4622b850f5c762049a2314271e40a23a8df5a1c5ab6b55d18c2f2ee50fe2875b8c7421181"

RPROVIDES:${PN} += "cmake-KF5Init \
kinit-devel"

RDEPENDS:${PN} += "extra-cmake-modules"

inherit rpm
