SUMMARY = "Javadoc for jackson-core"
DESCRIPTION = "This package contains API documentation for jackson-core."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-core-javadoc-2.13.3-1.4.noarch.rpm"
RPM_HASH = "4fe26b223b82f04beb2dbdf9ad81bf60afc3894c9f0a6634324903a5be03d41f2f715aeaab8fae97fc4fdedd08c1a33d4c9d6aed0701915776d3fef85b7a2dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
