SUMMARY = "RELAX NG Object Model/Parser"
DESCRIPTION = "This package contains RELAX NG Object Model/Parser."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-rngom-2.3.1-4.4.noarch.rpm"
RPM_HASH = "52ea80b8f28a5995c0a1641ead02dc6fd748aa8f54d806b740b4943d945534d8f87abdcb3ff5b6071b825a58739c6a0f5271ccab4d72a2b548631cffa127d98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-rngom \
mvn-com.sun.xml.bind.external-rngom \
mvn-com.sun.xml.bind.external-rngom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.external-relaxng-datatype"

inherit rpm
