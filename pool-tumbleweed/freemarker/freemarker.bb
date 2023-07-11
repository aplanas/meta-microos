SUMMARY = "The Apache FreeMarker Template Engine"
DESCRIPTION = "Apache FreeMarker is a template engine: a Java library to generate text output \
(HTML web pages, e-mails, configuration files, source code, etc.) based on \
templates and changing data. Templates are written in the FreeMarker Template \
Language (FTL), which is a simple, specialized language (not a full-blown \
programming language like PHP)."
LICENSE = "Apache-2.0"

PV = "2.3.31"

RPM_NAME = "freemarker-2.3.31-3.1.noarch.rpm"
RPM_HASH = "503cd6282540b32b5e506f98fc6335c6831a4d20ba08e1650513dab71d8e73a237f8526ef6dbbce2f9a89f15f6c754e8d36bb30a80ad0e5a382e58847832958d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freemarker \
mvn-org.freemarker-freemarker \
mvn-org.freemarker-freemarker-pom- \
osgi-org.freemarker.freemarker"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
