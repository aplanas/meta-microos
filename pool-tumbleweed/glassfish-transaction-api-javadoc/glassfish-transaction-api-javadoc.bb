SUMMARY = "Javadoc for glassfish-transaction-api"
DESCRIPTION = "This package contains javadoc for glassfish-transaction-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-javadoc-1.3-3.11.noarch.rpm"
RPM_HASH = "b75f7533ac4d77cde80b564b9dd2b6c30910c269965a35c8ce80dd761685f974bc84af9755403c9ae966e11964d6e02de92d52bc705043a0540a0283cd05d751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
