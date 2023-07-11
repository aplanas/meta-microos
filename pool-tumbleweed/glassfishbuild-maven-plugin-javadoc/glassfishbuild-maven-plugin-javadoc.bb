SUMMARY = "API documentation for glassfishbuild-maven-plugin"
DESCRIPTION = "This package provides API documentation for glassfishbuild-maven-plugin."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.2.26"

RPM_NAME = "glassfishbuild-maven-plugin-javadoc-3.2.26-2.11.noarch.rpm"
RPM_HASH = "bb5df0a772af392f71160c4f11c1a31c4deab88c3a6e1e60e4c82e8eade33f2ae87186d31ee85f18a9b82e1859de491c78a1cbb12d5ac5b2949a1c081c5cbdbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfishbuild-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
