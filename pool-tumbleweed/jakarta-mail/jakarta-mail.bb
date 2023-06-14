SUMMARY = "Jakarta Mail API"
DESCRIPTION = "Jakarta Activation lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to \
it; discover the operations available on it; and instantiate the \
appropriate bean to perform the operation(s)."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.1.0"

RPM_NAME = "jakarta-mail-2.1.0-1.6.noarch.rpm"
RPM_HASH = "bc80153d7eb9edc29db18b32db32a4ecaab102a7aeaa6be7685b70d974159c14bbd4fb2ad404a7a11cfb3cdc09c782bd029ebef54bf7014b80c7f677ce1cbda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-mail \
mvn-jakarta.mail-jakarta.mail-api \
mvn-jakarta.mail-jakarta.mail-api-pom- \
osgi-jakarta.mail-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.activation-jakarta.activation-api"

inherit rpm
