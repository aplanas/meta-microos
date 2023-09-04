SUMMARY = "Javadoc for jackson-jaxrs-providers"
DESCRIPTION = "This package contains API documentation for jackson-jaxrs-providers."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "cd0190a2ef95c135957fd63ed63213a84f7967dbf25f863c6c47ba0994ce4e643c540b82343453230d2a057d94a280a461edb9ae7f9780656bec516073051b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
