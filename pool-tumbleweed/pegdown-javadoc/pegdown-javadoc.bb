SUMMARY = "Javadoc for pegdown"
DESCRIPTION = "This package contains javadoc for pegdown."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "pegdown-javadoc-1.4.2-2.6.noarch.rpm"
RPM_HASH = "1c571fcbedc9dd53aa3e5291219506a71fc396ea6ae1a36be4f2d3750bc76b33421ad2be0e80c5713d6b1b2e2800aa645dfc530e58e880560f45b1d9527a518c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pegdown-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
