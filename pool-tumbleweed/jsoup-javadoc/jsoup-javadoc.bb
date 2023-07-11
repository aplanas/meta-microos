SUMMARY = "Javadoc for jsoup"
DESCRIPTION = "API documentation for jsoup."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "jsoup-javadoc-1.15.3-2.3.noarch.rpm"
RPM_HASH = "377a879b83e9b0404a22c4997fba7b3a560552f843e9ea37867b9068d1daf83eb82914e5f99ac12b936b77216f97daae08e61097f91fbcdbbc55e03091ad4ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsoup-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
