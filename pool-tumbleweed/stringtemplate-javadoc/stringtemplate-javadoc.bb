SUMMARY = "API documentation for stringtemplate"
DESCRIPTION = "API documentation for package stringtemplate."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "stringtemplate-javadoc-3.2.1-2.7.noarch.rpm"
RPM_HASH = "629efce81dda3afc339c2ff45f514c01b80eb84330ff87f8c3f5caaab9e2bf7dc56a47cfbccfbd92154fb08aacacf5dd167d6805bc1fd36d16cad08cca999e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stringtemplate-javadoc"

RDEPENDS:${PN} += "java-javadoc \
javapackages-filesystem"

inherit rpm
