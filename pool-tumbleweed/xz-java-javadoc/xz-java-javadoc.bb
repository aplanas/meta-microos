SUMMARY = "API documentation of Java XZ compression library"
DESCRIPTION = "This package contains the API documentation of xz-java."
LICENSE = "SUSE-Public-Domain"

PV = "1.9"

RPM_NAME = "xz-java-javadoc-1.9-1.2.noarch.rpm"
RPM_HASH = "e0dbb464e7b0ba9aba85af5dcd602ba37260e1caa4267accbe69674e002025047014b2b54700e2f7ad2370fc08399b934c9a85e0da45c22b2a411b78a7f5b007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xz-java-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
