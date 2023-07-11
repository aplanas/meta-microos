SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kinit-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "901c20a3021267c341a1eb60d433e4b1642305148823ae824a95701a4a73335a9665b7f7b188c012fe54e9f1b354fbb099587f61bfdf6b81b1f260d46303e304"

RPROVIDES:${PN} += "cmake-KF5Init \
kinit-devel"

RDEPENDS:${PN} += "extra-cmake-modules"

inherit rpm
