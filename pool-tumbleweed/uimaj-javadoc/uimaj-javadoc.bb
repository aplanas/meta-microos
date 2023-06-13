SUMMARY = "Javadoc for uimaj"
DESCRIPTION = "This package contains javadoc for uimaj."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "uimaj-javadoc-2.8.1-3.10.noarch.rpm"
RPM_HASH = "8385d5dcf9de0fdc844d6c9ff9ac383e7801a00f7fac997ee24fd12be6f9755f09aa46c102197d9cf55ace445848da257ecee18d3e2186016122156bacb93cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uimaj-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
