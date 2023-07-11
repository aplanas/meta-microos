SUMMARY = "API documentation for jaxb-api"
DESCRIPTION = "API documentation for jaxb-api."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "jaxb-api-javadoc-4.0.0-2.6.noarch.rpm"
RPM_HASH = "50d17cd708774e749843b4db4d850ff45e9cfcb5010af0ca35c170da9beccfc9960e09f1d2e255ecb02d4612ab1d490a5d815b688958b7d5b5e95399768e133a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxb-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
