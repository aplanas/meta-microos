SUMMARY = "Javadoc for jackson-datatypes-collections"
DESCRIPTION = "This package contains API documentation for jackson-datatypes-collections."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatypes-collections-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "eb6efee51d95c5692c2fda15998548b122b68be5d8f6d8ceb331d108f9c2a786c3ba0849eeca1d4aaa54f83ff642067c143b0086bd2969346292c2a4fdbc7eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
