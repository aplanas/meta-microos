SUMMARY = "Javadoc for jersey"
DESCRIPTION = "This package contains javadoc for jersey."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.28"

RPM_NAME = "jersey-javadoc-2.28-6.11.noarch.rpm"
RPM_HASH = "a0df30a66cde9c2b3fbdd913b0a51b2a90421d267bf86662d59d554018797b5331e2f3a0dec34f06e047b81a86f5b93e2fbbc6cd97623cdaac13d170460f1c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jersey-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
