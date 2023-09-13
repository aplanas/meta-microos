SUMMARY = "API documentation for maven-archetype"
DESCRIPTION = "API documentation for maven-archetype."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-javadoc-3.2.1-2.1.noarch.rpm"
RPM_HASH = "58f3f6b24888b68df246168130f1d99d238c5571277cb8d5501779b9d0f058ea2810331a59e0ac0ce98094665720687ae276ac3c21fd60a32202f63bf3813124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
