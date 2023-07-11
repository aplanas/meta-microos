SUMMARY = "Javadoc for paranamer"
DESCRIPTION = "This package contains the API documentation for paranamer."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-javadoc-2.8-2.11.noarch.rpm"
RPM_HASH = "ff2cbbc73a53ac81919df87c013a539d1b6a41ef847b432355a46a2b13614bed1f102677b31b16c74fe8f27c6183ee633e80942fbb1bc34dc62bfbe8654a15d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paranamer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
