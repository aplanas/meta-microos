SUMMARY = "Javadoc for plexus-ant-factory"
DESCRIPTION = "Javadoc for plexus-ant-factory."
LICENSE = "Apache-2.0"

PV = "1.0~a2.1"

RPM_NAME = "plexus-ant-factory-javadoc-1.0~a2.1-2.6.noarch.rpm"
RPM_HASH = "1fe7904bdc19d3037ad5e13ad0ffd381f1f8852009128ccccb0277fd585bab37d28bc170a7113a398d5ad322a697904d5a1e44de0b5914b51cedbffc520bd7db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-ant-factory-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
