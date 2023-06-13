SUMMARY = "API documentation for apache-commons-fileupload"
DESCRIPTION = "This package contains the API documentation for apache-commons-fileupload."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "apache-commons-fileupload-javadoc-1.5-1.1.noarch.rpm"
RPM_HASH = "46ae36a1ede01b9bc18aabf61b3447eab548b563d2e42b53bd8bfa609d100a39d5d394530996c6f4a36ebd63015d1067cdc59860036b4828b126d853cdcdb592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-fileupload-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
