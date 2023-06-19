SUMMARY = "Javadoc for jboss-annotations-1.2-api"
DESCRIPTION = "This package contains javadoc for jboss-annotations-1.2-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.2"

RPM_NAME = "jboss-annotations-1.2-api-javadoc-1.0.2-2.6.noarch.rpm"
RPM_HASH = "cd28d12b5b47f9898c7eafe20408e5b3146dc14f252fd04dba198fd2bc344287ee501125db47ced7f5371171461166d5008adf04d554623773949a27452fc8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-annotations-1.2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
