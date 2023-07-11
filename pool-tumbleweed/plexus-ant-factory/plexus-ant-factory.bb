SUMMARY = "Plexus Ant component factory"
DESCRIPTION = "Ant component class creator for Plexus."
LICENSE = "Apache-2.0"

PV = "1.0~a2.1"

RPM_NAME = "plexus-ant-factory-1.0~a2.1-2.7.noarch.rpm"
RPM_HASH = "bf326153d09f4d5ab852c446ecb38386c45325ead95182023b4e3f68148da4241bc28db738139c7cfa92c7dac19cccce3ef6e2c1a9a8643d00ea97e872d56c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-ant-factory \
mvn-org.codehaus.plexus-plexus-ant-factory-pom- \
plexus-ant-factory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-launcher \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
