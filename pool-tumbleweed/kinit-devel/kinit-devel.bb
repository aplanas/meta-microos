SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kinit-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "66098ea7c7479858de395947afa80996df646619b8f800678efa1fd0f42ac7086078509d7180db015f2910aa36d15493d7ee2b563fe07b70d6af12bd447487ca"

RPROVIDES:${PN} += "cmake(KF5Init) \
kinit-devel \
kinit-devel(aarch-64)"

RDEPENDS:${PN} += "extra-cmake-modules"

inherit rpm
