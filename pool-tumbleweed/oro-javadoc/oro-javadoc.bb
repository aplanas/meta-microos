SUMMARY = "Javadoc for oro"
DESCRIPTION = "Javadoc for oro."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "oro-javadoc-2.0.8-297.6.noarch.rpm"
RPM_HASH = "8bb34550dc7b5c840d290ae50272fd02a947089e0d951ad26fd87775e99b9ca7c2ca47eb907f5f03cf3a53090408f2fec4052b2474c825c6b3c03ce5e83596cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oro-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
