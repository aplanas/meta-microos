SUMMARY = "Javadoc for extra166y"
DESCRIPTION = "This package contains javadoc for extra166y."
LICENSE = "SUSE-Public-Domain"

PV = "1.7.0"

RPM_NAME = "extra166y-javadoc-1.7.0-3.10.noarch.rpm"
RPM_HASH = "8f2efd62c4deae0ba4376c0bc54583ea4ac85afe0e2ff3ec1226451d2efb6022617869d9631b8724ddca1428eaa09c0dbcb3e1335c286ff4f0141ee173ce7623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra166y-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
