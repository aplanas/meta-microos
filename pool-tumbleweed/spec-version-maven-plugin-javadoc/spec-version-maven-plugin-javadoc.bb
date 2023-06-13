SUMMARY = "Javadoc for spec-version-maven-plugin"
DESCRIPTION = "This package contains javadoc for spec-version-maven-plugin."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "2.1"

RPM_NAME = "spec-version-maven-plugin-javadoc-2.1-1.10.noarch.rpm"
RPM_HASH = "7d363bedddc1c86e6d1709cd4f00f28a3342668b1e48caaaa69c0dfb48559692ad9616963a7506ce3ce0d3bca103a6322954ea455637ced4d22fdafa53fb2743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spec-version-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
