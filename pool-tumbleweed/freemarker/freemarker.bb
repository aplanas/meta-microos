SUMMARY = "The Apache FreeMarker Template Engine"
DESCRIPTION = "Apache FreeMarker is a template engine: a Java library to generate text output \
(HTML web pages, e-mails, configuration files, source code, etc.) based on \
templates and changing data. Templates are written in the FreeMarker Template \
Language (FTL), which is a simple, specialized language (not a full-blown \
programming language like PHP)."
LICENSE = "Apache-2.0"

PV = "2.3.31"

RPM_NAME = "freemarker-2.3.31-4.1.noarch.rpm"
RPM_HASH = "ba4c9438fe87d74a93c02de7697dc857c8cff3decadbc82edc145932ac0b410785058a24d213f4ae471e711861c5abe7cc95572550aba872121e6a8ee4c273c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freemarker \
mvn-org.freemarker-freemarker \
mvn-org.freemarker-freemarker-pom- \
osgi-org.freemarker.freemarker"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
