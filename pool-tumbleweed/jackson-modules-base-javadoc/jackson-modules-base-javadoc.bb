SUMMARY = "Javadoc for jackson-modules-base"
DESCRIPTION = "This package contains API documentation for jackson-modules-base."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-modules-base-javadoc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "6be6bf3bc8d5e3255108771e6ef0bd669982a48c9510f69bb7baf8a32e03906e5f6f8b086a3994374103bddd3a689da6610fea0d03728a43bf696dbf713357ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
