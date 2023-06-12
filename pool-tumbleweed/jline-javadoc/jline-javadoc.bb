SUMMARY = "Javadocs for jline"
DESCRIPTION = "This package contains the API documentation for jline."
LICENSE = "BSD-3-Clause"

PV = "2.14.6"

RPM_NAME = "jline-javadoc-2.14.6-5.4.noarch.rpm"
RPM_HASH = "b841365aa8c9a119d9ae16041be6d56fad55f009b9265e2dac34a08c24762d65c4ec3c8d929171ccbab8cdb1100eced577a8a648ac844656884a6721daf7cafe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
