SUMMARY = "Javadoc for jackson-dataformats-text"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-text."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-text-javadoc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "097e393cd0b2fd341301210ae555fe91994859f896db2a15c6ab791a53d91da14915613e53ca30dbcc2d4eacc515c23d7cc4f678029be90b1083c8bf0fb83275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
