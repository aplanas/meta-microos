SUMMARY = "API documentation for args4j"
DESCRIPTION = "This package contains the API documentation for args4j."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-javadoc-2.33-2.7.noarch.rpm"
RPM_HASH = "abeb2c3e901836c174d7f4757b047fc7ecaff0d60bc66ffbcae64572bc89dcfa6fd5d48d3e64005c311f023df980692fcc79e2652017ebf60e102904b55a4a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
