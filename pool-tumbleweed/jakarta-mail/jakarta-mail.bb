SUMMARY = "Jakarta Mail API"
DESCRIPTION = "Jakarta Activation lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to \
it; discover the operations available on it; and instantiate the \
appropriate bean to perform the operation(s)."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.0"

RPM_NAME = "jakarta-mail-2.1.0-1.7.noarch.rpm"
RPM_HASH = "fce2dc7455821b8681995410c63a8559534ee4c375a160bbdbf595d97b4d3d304918faa1c4d009c1b08f89769c713cb93af598290c7fcb106b855e60a992cc31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-mail \
mvn-jakarta.mail-jakarta.mail-api \
mvn-jakarta.mail-jakarta.mail-api-pom- \
osgi-jakarta.mail-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.activation-jakarta.activation-api"

inherit rpm
