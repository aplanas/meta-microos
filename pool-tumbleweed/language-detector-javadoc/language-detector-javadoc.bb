SUMMARY = "Javadoc for language-detector"
DESCRIPTION = "This package contains javadoc for language-detector."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "language-detector-javadoc-0.6-2.15.noarch.rpm"
RPM_HASH = "3b24d284dda13327526dd5f59b3075417679bf322d4bd9afe012ed0c4855a22e66a70f90343e176e4b5b2583216fd1f90b3a9ccce465be032638e839ee4ddad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "language-detector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
