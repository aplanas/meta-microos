SUMMARY = "Javadoc for plexus-resources"
DESCRIPTION = "API documentation for plexus-resources."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-resources-javadoc-1.0~a7-2.6.noarch.rpm"
RPM_HASH = "2dcb6a0cb11e091133f348e2f108e86aac8946aa85d8b7357b86b3a3a90b611986c6544a460a5277ef93c12bfc89900ab713a59b94a560a4e1d587d4ddc05f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-resources-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
