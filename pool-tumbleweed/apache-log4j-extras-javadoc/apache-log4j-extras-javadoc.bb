SUMMARY = "Javadoc for apache-log4j-extras"
DESCRIPTION = "This package contains the API documentation for apache-log4j-extras."
LICENSE = "Apache-2.0"

PV = "1.2.17.1"

RPM_NAME = "apache-log4j-extras-javadoc-1.2.17.1-3.11.noarch.rpm"
RPM_HASH = "9a147c7676e5b6faf32119edf86a42725b9da600ea422fcc7ffec780c6794b24973d4ac5a8270e12a22ad52e8b89f4f99274f809be6120d34178a2ba7750b869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-log4j-extras-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
