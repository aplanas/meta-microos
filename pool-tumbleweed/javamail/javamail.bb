SUMMARY = "Java Mail API"
DESCRIPTION = "The JavaMail API provides a platform-independent and protocol-independent \
framework to build mail and messaging applications."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.5.2"

RPM_NAME = "javamail-1.5.2-7.5.noarch.rpm"
RPM_HASH = "9c592c2760869eb761e8c058110fa734b5ec079441f174e7356949b11752dcaf79c2bca494e50e59e3ce01fb7e3299d0f1c0fde2d81c23a3503a2fc32b96dd34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javamail \
javamail-monolithic \
javax.mail \
mvn-com.sun.mail-all-pom- \
mvn-com.sun.mail-dsn \
mvn-com.sun.mail-dsn-pom- \
mvn-com.sun.mail-gimap \
mvn-com.sun.mail-gimap-pom- \
mvn-com.sun.mail-imap \
mvn-com.sun.mail-imap-pom- \
mvn-com.sun.mail-jakarta.mail \
mvn-com.sun.mail-jakarta.mail-pom- \
mvn-com.sun.mail-javax.mail \
mvn-com.sun.mail-javax.mail-pom- \
mvn-com.sun.mail-mailapi \
mvn-com.sun.mail-mailapi-pom- \
mvn-com.sun.mail-pop3 \
mvn-com.sun.mail-pop3-pom- \
mvn-com.sun.mail-smtp \
mvn-com.sun.mail-smtp-pom- \
mvn-javax.mail-javax.mail-api \
mvn-javax.mail-javax.mail-api-pom- \
mvn-javax.mail-mail \
mvn-javax.mail-mail-pom- \
mvn-javax.mail-mailapi \
mvn-javax.mail-mailapi-pom- \
mvn-org.eclipse.jetty.orbit-javax.mail.glassfish \
mvn-org.eclipse.jetty.orbit-javax.mail.glassfish-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-activation"

inherit rpm
