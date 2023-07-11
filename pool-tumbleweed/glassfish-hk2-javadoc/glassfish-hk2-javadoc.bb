SUMMARY = "Javadoc for glassfish-hk2"
DESCRIPTION = "This package contains API documentation for glassfish-hk2."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-javadoc-2.5.0-2.4.noarch.rpm"
RPM_HASH = "f15aa443de6492018e2a4a350f9a0dc9c50618ec6462b1a98eb1f98e3d50373c330b8864747f2abcb4d4daf322d17584c11d117cca1a753868633e34858126ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
