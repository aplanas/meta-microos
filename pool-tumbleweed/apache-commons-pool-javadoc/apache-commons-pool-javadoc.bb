SUMMARY = "Javadoc for apache-commons-pool"
DESCRIPTION = "The goal of Pool package it to create and maintain an object (instance) \
pooling package to be distributed under the ASF license. The package \
should support a variety of pool implementations, but encourage support \
of an interface that makes these implementations interchangeable. \
 \
This package contains the javadoc documentation for the Apache Commons \
Pool Package."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "apache-commons-pool-javadoc-1.6-5.16.noarch.rpm"
RPM_HASH = "5d1a462b8a63c1738c2aabf9609fcc7552da61136a154f3200e7a4f53eaaa8f4c6106252eb4a38776d6a9ab8820b82b3eb4ae3421b6e07fc9f43fce1d8c984ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
