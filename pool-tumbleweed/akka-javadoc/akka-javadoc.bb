SUMMARY = "Javadoc for akka"
DESCRIPTION = "This package contains javadoc for akka."
LICENSE = "Apache-2.0"

PV = "2.3.16"

RPM_NAME = "akka-javadoc-2.3.16-8.10.noarch.rpm"
RPM_HASH = "b5469181d696b7decff724ee1a30bfb3930e4311b83b740b5a8ec6c78bd9c3160c96ec9f90a2d43152896e91dc963497fc0f54af2f3a253a5802403cdd1825a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akka-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
