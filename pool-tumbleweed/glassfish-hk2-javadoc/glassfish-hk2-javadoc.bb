SUMMARY = "Javadoc for glassfish-hk2"
DESCRIPTION = "This package contains API documentation for glassfish-hk2."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-javadoc-2.5.0-4.1.noarch.rpm"
RPM_HASH = "c59d0bedd36ff601336c70f47345e2a4a80aa62745dba1ca448d9eeff62a0c36f3d29969ed7b2b267ed8eb0e752b88bda46124adaa2af4e14fdff54e5cb102c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
