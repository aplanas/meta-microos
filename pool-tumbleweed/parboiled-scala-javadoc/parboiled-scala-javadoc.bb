SUMMARY = "Javadoc for parboiled-scala"
DESCRIPTION = "This package contains javadoc for parboiled-scala."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "parboiled-scala-javadoc-1.1.6-5.6.noarch.rpm"
RPM_HASH = "8f8ed12ca6f50706032eb2ebdd34148d6cbfc725fae295693eab865634ec67a3ac143a9d8daecf464e305371a686d91c9213ca53b29a34da69fa3e38600231c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parboiled-scala-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
