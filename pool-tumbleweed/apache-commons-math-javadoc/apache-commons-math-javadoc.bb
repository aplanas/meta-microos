SUMMARY = "Javadoc for apache-commons-math"
DESCRIPTION = "This package contains the API documentation for apache-commons-math."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-javadoc-3.6.1-7.7.noarch.rpm"
RPM_HASH = "61470c6e5358d3c1c93a25cb03df42fd92702af5aaea3c4aaf1b89c685d53c22c55c0667926b989fe4e8943997d8bcb27e8f02be6b923a254ff3ad970d4ca56a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
