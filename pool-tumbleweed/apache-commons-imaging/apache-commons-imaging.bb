SUMMARY = "Apache Commons Imaging"
DESCRIPTION = "Apache Commons Imaging (previously Sanselan) is a pure-Java image library."
LICENSE = "Apache-2.0"

PV = "1.0~alpha2"

RPM_NAME = "apache-commons-imaging-1.0~alpha2-2.9.noarch.rpm"
RPM_HASH = "d668813a7af0214b82a62b13817efa32652327fe1f092c84caf60478473fe8e19c4d6c994e27b213251fe4d58cee8e6d97388db5f4006bb251353ee0caca0bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-imaging \
mvn(org.apache.commons:commons-imaging) \
mvn(org.apache.commons:commons-imaging:pom:) \
osgi(org.apache.commons.commons-imaging)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
