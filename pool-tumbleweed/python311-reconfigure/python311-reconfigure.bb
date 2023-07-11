SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.82"

RPM_NAME = "python311-reconfigure-0.1.82-1.18.noarch.rpm"
RPM_HASH = "258dc29a7059118b830908246ed30dd7df7cf0c700bc28ef7471dd09a5761b741a45d73c6fdba1c668bdae0e8b1b8bbb4cd1eb85208d1b724f8d11420edc8389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reconfigure \
python3.11dist-reconfigure \
python311-reconfigure \
python3dist-reconfigure"

RDEPENDS:${PN} += "python-abi \
python311-chardet"

inherit rpm
