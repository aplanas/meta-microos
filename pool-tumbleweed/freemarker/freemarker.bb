SUMMARY = "The Apache FreeMarker Template Engine"
DESCRIPTION = "Apache FreeMarker is a template engine: a Java library to generate text output \
(HTML web pages, e-mails, configuration files, source code, etc.) based on \
templates and changing data. Templates are written in the FreeMarker Template \
Language (FTL), which is a simple, specialized language (not a full-blown \
programming language like PHP)."
LICENSE = "Apache-2.0"

PV = "2.3.31"

RPM_NAME = "freemarker-2.3.31-2.8.noarch.rpm"
RPM_HASH = "0e51abfe6eb1820cae8d0079a4e651bdc21126ccd1b7e342cd160c6c36c6b54d6897506dc7b4950cb6b1e368782a138b28ff201276112c52ac8accae87d489df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freemarker \
mvn(org.freemarker:freemarker) \
mvn(org.freemarker:freemarker:pom:) \
osgi(org.freemarker.freemarker)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
