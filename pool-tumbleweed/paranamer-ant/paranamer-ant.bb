SUMMARY = "ParaNamer Ant"
DESCRIPTION = "This package contains the ParaNamer Ant tasks."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-ant-2.8-2.11.noarch.rpm"
RPM_HASH = "a072022960b99910254813ba163ac5e9983f8bac6f89ea6fc8d3ca74c7891690dc40c532ca11f08bb8c8cd5c6aa526b6abc732d79ae3f710d33852ebc1dfad44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-ant \
mvn-com.thoughtworks.paranamer-paranamer-ant-pom- \
paranamer-ant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.ant-ant"

inherit rpm
