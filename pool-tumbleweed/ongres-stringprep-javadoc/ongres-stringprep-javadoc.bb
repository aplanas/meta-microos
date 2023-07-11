SUMMARY = "Javadoc for ongres-stringprep"
DESCRIPTION = "This package contains javadoc for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-javadoc-1.1-1.11.noarch.rpm"
RPM_HASH = "6ef53691f4ab11419e407bd768cf9b3649392afab83fb3e204e2bb92e23ec52880d89b81d00cfec927bb7368247951aa89ba5162303ab313245dda46da76f881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ongres-stringprep-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
