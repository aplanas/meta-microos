SUMMARY = "Javadoc for apache-commons-digester"
DESCRIPTION = "The goal of the Jakarta Commons Digester project is to create and \
maintain a XML -> Java object mapping package written in the Java \
language to be distributed under the ASF license. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Digester Package."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "apache-commons-digester-javadoc-2.1-4.6.noarch.rpm"
RPM_HASH = "031d6631107af43c89591e7e68856b7c144417b55604b74c65d617c460fc264993b6b1010992b607d1889db51ed26d6f65f781ba29cc6640a71cccb68005012c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
