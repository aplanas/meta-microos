SUMMARY = "Manual for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains the manual for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-manual-1.10.13-2.2.noarch.rpm"
RPM_HASH = "af97cc17c1e0c2603d97f44b16158453b2c64a71b749e219ce9dbbaa5a173798f3b04e2643322fc7701535f45c225b32e1256bd13d52e424720c0f66ac3a8b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-manual"

RDEPENDS:${PN} += ""

inherit rpm
