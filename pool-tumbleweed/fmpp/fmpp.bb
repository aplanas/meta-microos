SUMMARY = "FreeMarker-based text file PreProcessor"
DESCRIPTION = " \
FMPP is a general-purpose text file preprocessor tool that uses \
FreeMarker templates. It is particularly designed for HTML \
preprocessor, to generate complete (static) homepages: directory \
structure that contains HTML-s, image files, etc. But of course it can \
be used to generate source code or whatever text files. FMPP is \
extendable with Java classes to pull data from any data sources \
(database, etc.) and embed the data into the generated files."
LICENSE = "Apache-2.0"

PV = "0.9.16"

RPM_NAME = "fmpp-0.9.16-2.10.noarch.rpm"
RPM_HASH = "0a857e91c6f894de1d4a5211d13d3f3109af8797ea6cdfc88d3ef09c3e35264a170a5880c8c0b38bbdb16fc6388779f5bf9951aeadf452a0a405af49930d7bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fmpp \
mvn-net.sourceforge.fmpp-fmpp \
mvn-net.sourceforge.fmpp-fmpp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.beanshell-bsh \
mvn-org.freemarker-freemarker \
mvn-xml-resolver-xml-resolver"

inherit rpm
