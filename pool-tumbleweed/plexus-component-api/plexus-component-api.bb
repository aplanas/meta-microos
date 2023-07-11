SUMMARY = "Plexus Component API"
DESCRIPTION = "Plexus Component API"
LICENSE = "Apache-2.0"

PV = "1.0~alpha15"

RPM_NAME = "plexus-component-api-1.0~alpha15-2.7.noarch.rpm"
RPM_HASH = "a81de71d3413f7f52cf4bc8334da3de898e86337ff57eef42ca838873e718bc59bb8530dcc1ce7da436cede61cd92c9bb8abfc8aaceb37d330b8e67ef3428dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-api \
mvn-org.codehaus.plexus-plexus-component-api-pom- \
plexus-component-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-classworlds"

inherit rpm
