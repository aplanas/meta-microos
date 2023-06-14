SUMMARY = "BND Tool"
DESCRIPTION = "The bnd tool helps you create and diagnose OSGi bundles. \
The key functions are: \
- Show the manifest and JAR contents of a bundle \
- Wrap a JAR so that it becomes a bundle \
- Create a Bundle from a specification and a class path \
- Verify the validity of the manifest entries \
The tool is capable of acting as: \
- Command line tool \
- File format \
- Directives \
- Use of macros"
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "aqute-bnd-5.2.0-3.1.noarch.rpm"
RPM_HASH = "83e907ecbf9c478f6631725c112043d0a073ab06f9ce11ba4be442f6a8a9413b99906348e7ca7420ebfa30e94e29e7cb9269ecdd18dee11aab1e27a8ea2e0697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bnd \
config-aqute-bnd \
mvn-biz.aQute-bnd \
mvn-biz.aQute-bnd-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd \
mvn-biz.aQute.bnd-biz.aQute.bnd-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.ant \
mvn-biz.aQute.bnd-biz.aQute.bnd.ant-pom- \
mvn-biz.aQute.bnd-bnd \
mvn-biz.aQute.bnd-bnd-pom-"

RDEPENDS:${PN} += "/bin/bash \
aqute-bndlib \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-biz.aQute.bnd-aQute.libg \
mvn-biz.aQute.bnd-biz.aQute.bnd.annotation \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-org.apache.ant-ant \
mvn-org.osgi-osgi.annotation \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
