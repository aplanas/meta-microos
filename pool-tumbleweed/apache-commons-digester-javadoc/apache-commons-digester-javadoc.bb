SUMMARY = "Javadoc for apache-commons-digester"
DESCRIPTION = "The goal of the Jakarta Commons Digester project is to create and \
maintain a XML -> Java object mapping package written in the Java \
language to be distributed under the ASF license. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Digester Package."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "apache-commons-digester-javadoc-2.1-4.7.noarch.rpm"
RPM_HASH = "19dd5df225850d756c6c80f201f25a93a867f79af66e72f8a349cd068c67f45d32bbaac2c3df5c5b83396f7e252788ea77b301d2ba57bae19cd2c3174f799d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
