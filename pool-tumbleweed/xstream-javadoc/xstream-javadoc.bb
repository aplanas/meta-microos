SUMMARY = "Javadoc for xstream"
DESCRIPTION = "xstream API documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-javadoc-1.4.20-3.1.noarch.rpm"
RPM_HASH = "cc40113660ad6445f3c3667834ea016228d64d58888adaaa9c4218dd53989835796f635280535e34ee16e478aab02962e221025ddf5fb404d123b7ed5d218002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xstream-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
