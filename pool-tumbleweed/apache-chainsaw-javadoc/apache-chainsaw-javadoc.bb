SUMMARY = "API documentation for apache-chainsaw"
DESCRIPTION = "API documentation for apache-chainsaw."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "apache-chainsaw-javadoc-2.1.0-3.11.noarch.rpm"
RPM_HASH = "8b4a61a8f336e650f18c9a061ff622481113ce6abf9d4cc20a6d4d09b364992599f7b77d437c7f5b2b4fcc023e04519fcb07609cb6212e10318af1a5b196e03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-chainsaw-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
