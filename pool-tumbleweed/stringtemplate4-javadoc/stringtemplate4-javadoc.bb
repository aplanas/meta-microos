SUMMARY = "Javadoc for stringtemplate4"
DESCRIPTION = "This package contains javadoc for stringtemplate4."
LICENSE = "BSD-3-Clause"

PV = "4.3"

RPM_NAME = "stringtemplate4-javadoc-4.3-2.11.noarch.rpm"
RPM_HASH = "1918c8aff918dc73681cf0a8b71b6c40202bff28515cb8774d7d1f98e83aec1c239f6d5b0fee445fac53a09c5d280dbbe082b0ab8b28896057124fbd5639388e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stringtemplate4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
