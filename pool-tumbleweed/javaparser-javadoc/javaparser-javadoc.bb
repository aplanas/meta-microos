SUMMARY = "Javadoc for javaparser"
DESCRIPTION = "This package contains API documentation for javaparser."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.3"

RPM_NAME = "javaparser-javadoc-3.25.3-1.1.noarch.rpm"
RPM_HASH = "9da259f3a92fec9cb9f73ed8cabbce8482c01480befdccd007ef09b63cc26b26615cea284278692ef324a3b5899342528c605b70b19f513891504019b2c3b478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
