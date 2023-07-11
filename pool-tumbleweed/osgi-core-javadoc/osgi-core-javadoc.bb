SUMMARY = "API documentation for osgi-core"
DESCRIPTION = "This package provides API documentation for osgi-core."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-core-javadoc-7.0.0-3.5.noarch.rpm"
RPM_HASH = "988aaf6b897d099acae39d6e1cad65433cf1dfa0f10224edd10e45d7b8669d8a76bf0c66aae3926e13b4671e312c538326db8c61f25beeb8bf301bda34fd5311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
