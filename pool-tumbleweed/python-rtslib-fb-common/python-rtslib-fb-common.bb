SUMMARY = "Common python-rtslib-fb subpackage for Python 2 or 3"
DESCRIPTION = "python-rtslib-fb-common is the invariant base package needed by both \
python2-rtslib-fb and python3-rtslib-fb."
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python-rtslib-fb-common-2.1.75-3.3.noarch.rpm"
RPM_HASH = "dc5b660499ba6915b6e02d5450fe60dba77aa3f51976fc4732b5b53536e7ad6b8e9186b874b3896df00d0e1c143f8e12eab72eba5258c8f1dc1aac1143a1d80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rtslib-fb-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
