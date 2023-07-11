SUMMARY = "Javadoc for jopt-simple"
DESCRIPTION = "This package contains the API documentation for jopt-simple."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-javadoc-5.0.4-1.21.noarch.rpm"
RPM_HASH = "1a38dd010fe1850031c528e021c137bb3ac3f1c0ee6d89137766eeae161750ef3292c3842a0e289cec30db397c8fffd6bb0f4435247e514ceb8644ea4d639f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
