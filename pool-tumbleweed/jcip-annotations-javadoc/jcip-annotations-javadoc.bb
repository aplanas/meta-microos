SUMMARY = "Javadoc for jcip-annotations"
DESCRIPTION = "Class, field, and method level annotations for describing thread-safety \
policies."
LICENSE = "CC-BY-2.5"

PV = "1.0"

RPM_NAME = "jcip-annotations-javadoc-1.0-21.6.noarch.rpm"
RPM_HASH = "6080ba3b7c808b379f306fcf5934d3e133e5ede4ac38077383a79d0aed82ef9a6c0e45820aff4dc230d9ea2a33f4044a6e312418230a0c4e18394025709e8d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcip-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
