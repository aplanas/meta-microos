SUMMARY = "Javadoc for glassfish-transaction-api"
DESCRIPTION = "This package contains javadoc for glassfish-transaction-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-javadoc-1.3-4.1.noarch.rpm"
RPM_HASH = "3c22f5c3da023ca355a884b8bde6b3df93e6cbfd0526ae92a507ae57dee4775b0dc0f41c079601291426081d1797db41e46493e0452293c793f16033bcc3fad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
