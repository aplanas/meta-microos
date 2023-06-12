SUMMARY = "Manual for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains the manual for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-manual-1.10.13-2.1.noarch.rpm"
RPM_HASH = "e3ac6df62aa3415256f3bf7f825be9d1b0b244d0be0004eeb07447a152f79dbbdb062faaeeeda1426d18940e53b413076c01023af337ee6c59478e7a8b17575d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-manual"
RDEPENDS:${PN} += ""

inherit rpm
