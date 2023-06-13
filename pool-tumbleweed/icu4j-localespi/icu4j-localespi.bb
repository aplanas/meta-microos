SUMMARY = "Locale SPI library of icu4j"
DESCRIPTION = "Locale SPI library of icu4j."
LICENSE = "BSD-3-Clause & MIT & Unicode & SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-localespi-73.1-1.1.noarch.rpm"
RPM_HASH = "cb495db2592ab82a8f53f3f2366fad0b88a7e1258679f5e09afd114abc3c8d3e7ab71e7a6ff717b4d02e97d210f643645ec1a36a8fd7fc3b8da8fe6d2637edeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j-localespi \
mvn(com.ibm.icu:icu4j-localespi) \
mvn(com.ibm.icu:icu4j-localespi:pom:) \
osgi(com.ibm.icu.localespi)"

RDEPENDS:${PN} += "icu4j \
java-headless \
javapackages-filesystem \
mvn(com.ibm.icu:icu4j)"

inherit rpm
