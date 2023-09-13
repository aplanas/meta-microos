SUMMARY = "ParaNamer Ant"
DESCRIPTION = "This package contains the ParaNamer Ant tasks."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-ant-2.8-3.1.noarch.rpm"
RPM_HASH = "62e0cef8f3af75fab3156d3909496b96190a9dbbd500e6178e198b73d0d783aff6240408a20245caf695251c54fc655287889c10fa7ec7b5bd748d176d910fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-ant \
mvn-com.thoughtworks.paranamer-paranamer-ant-pom- \
paranamer-ant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.ant-ant"

inherit rpm
