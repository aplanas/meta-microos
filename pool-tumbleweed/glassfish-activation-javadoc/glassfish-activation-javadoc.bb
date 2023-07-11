SUMMARY = "Javadoc for glassfish-activation"
DESCRIPTION = "Javadoc for glassfish-activation."
LICENSE = "(BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-javadoc-1.2.0-4.4.noarch.rpm"
RPM_HASH = "5195851ed25ac2239479bcd2c12a7abf7220182d0d76c80088b2084aedca00d1fa3495e4ef680012b21b2368c3801b51707ba743ab01104f3f25ccd803b2b679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
