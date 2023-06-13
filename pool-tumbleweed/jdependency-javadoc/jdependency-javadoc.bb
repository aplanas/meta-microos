SUMMARY = "API documentation for jdependency"
DESCRIPTION = "API documentation for jdependency."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "jdependency-javadoc-1.2-4.6.noarch.rpm"
RPM_HASH = "e8945c2e92c57c54ddfb4ebdf694adc4d65cc4ca8c2bec05be54d6572192c227f17f09cac37a05987d7d9b31024b154cf552c3d089763206385486ba6858a727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdependency-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
