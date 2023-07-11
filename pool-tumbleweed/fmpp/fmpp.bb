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

RPM_NAME = "fmpp-0.9.16-2.11.noarch.rpm"
RPM_HASH = "5d8919b76f87f117f6689ea365fff5663cd18187d56e377a5b7586b0974df08fce31c4783a97b74bd57d3ced871dda54e45a8275a306908eb143b67df118d218"
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
