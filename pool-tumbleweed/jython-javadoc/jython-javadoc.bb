SUMMARY = "Javadoc for jython"
DESCRIPTION = "API documentation for jython."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "2.7.3"

RPM_NAME = "jython-javadoc-2.7.3-1.1.noarch.rpm"
RPM_HASH = "481bf3b281986b1cdbd7725996a4ada52093ca3d3d67602b88c39ae7dc57c218eb5dff75e32f6f35280198c61f46eff701f21b011a30281dbad4f303bde05657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jython-javadoc \
jython-manual"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
