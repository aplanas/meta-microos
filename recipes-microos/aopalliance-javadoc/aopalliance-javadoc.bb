SUMMARY = "API documentation for aopalliance"
DESCRIPTION = "This package contains the API documentation for aopalliance."
LICENSE = "SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "aopalliance-javadoc-1.0-3.1.noarch.rpm"
RPM_HASH = "53639e12b5f988426fdc34c93004c78a05104083c421202665ebfc684941cf2b6dd59ba669af3978922c8b97e7134578f170d791c5591b67b9b1f9c09efca5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aopalliance-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
