SUMMARY = "Javadoc for uncommons-maths"
DESCRIPTION = "This package contains javadoc for uncommons-maths."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-javadoc-1.2.3-1.19.noarch.rpm"
RPM_HASH = "546f3fcb216d4edfc4857f31ec76a764457f60d35e7a6a211911070535f45b0f7d0b807fcf3d58489e4280680c28e8e8dad9bde9e04200e51ef54bbd6a4ac751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uncommons-maths-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
