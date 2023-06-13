SUMMARY = "Header files for omniORBpy"
DESCRIPTION = "omniORBpy-devel contains the omniORBpy development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORBpy-devel-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "1a86c490f834dcd0f4de52542d4f59798915ec585a8112af6f6b7535f88b7df4b505884a6ff0043585ecde5d15b484b53ab5068d0a6773bc410a56b041568bd3"

RPROVIDES:${PN} += "omniORBpy-devel \
omniORBpy-devel(aarch-64)"

RDEPENDS:${PN} += "omniORBpy"

inherit rpm
