SUMMARY = "Javadoc for jetty-minimal"
DESCRIPTION = "Javadoc for jetty-minimal."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-minimal-javadoc-9.4.51-1.2.noarch.rpm"
RPM_HASH = "b3624b805ad6da330b32fcc27855c0e2e4c9c24c6b911a33a6bc8c3831a734cf18a52322d9190c2f565c5d6bd5cf3ad0b1c0416df104df59ad068342cbaf6f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-minimal-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
