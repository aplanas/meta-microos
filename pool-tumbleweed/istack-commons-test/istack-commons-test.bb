SUMMARY = "Istack-commons test"
DESCRIPTION = "This package contains istack-commons test."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-test-3.0.7-4.5.noarch.rpm"
RPM_HASH = "d6a0b372cd400ccb109b12bf9c97fc6514c43e908f1447a6d5ef1558fd2e9c8787097656edbf958e6a40adc2c25512abdaee9f283bfcdcacd9e3ff2a64c82aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-test \
mvn-com.sun.istack-istack-commons-test \
mvn-com.sun.istack-istack-commons-test-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-dom4j-dom4j \
mvn-junit-junit \
mvn-org.apache.ant-ant-junit"

inherit rpm
