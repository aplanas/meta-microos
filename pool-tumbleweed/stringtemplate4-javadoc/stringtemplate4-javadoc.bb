SUMMARY = "Javadoc for stringtemplate4"
DESCRIPTION = "This package contains javadoc for stringtemplate4."
LICENSE = "BSD-3-Clause"

PV = "4.3"

RPM_NAME = "stringtemplate4-javadoc-4.3-2.10.noarch.rpm"
RPM_HASH = "797cc8143971a8e5997e751c7411d13545cf33c516914d9b3c167262826d206367f3f0970f7dcfc5ade925f4274b0316a6b17283ad6a14117881e3c81daf7d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stringtemplate4-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
