SUMMARY = "Tool for automatic generation the Java and JNI code"
DESCRIPTION = "This package contains gluegen source code needed to build packages."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "gluegen2-devel-2.3.2-9.8.noarch.rpm"
RPM_HASH = "2b65cdf4972aa75dc8ecc54016ee50866e4b9a3c0b51b6f5694cc14cabcab99fd7b984290139444992b6c60671ad8e011750a0c7ed02b9c45c915d55e911468c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gluegen2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ant-antlr \
ant-contrib \
ant-junit \
cpptasks \
gluegen2"

inherit rpm
