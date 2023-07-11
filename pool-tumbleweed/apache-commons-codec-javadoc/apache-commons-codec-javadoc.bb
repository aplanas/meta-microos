SUMMARY = "Javadoc for apache-commons-codec"
DESCRIPTION = "Javadoc for apache-commons-codec."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "apache-commons-codec-javadoc-1.15-2.5.noarch.rpm"
RPM_HASH = "73126c687c0aab0c8e921fbee7cdce0b5e2e13f4255c4b9c2f4bda9e1b57471ee40c287fb390a61199f62757be9ac6d6109db2548debf242852748706bc89ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-codec-javadoc \
commons-codec-javadoc \
jakarta-commons-codec-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
javapackages-filesystem"

inherit rpm
