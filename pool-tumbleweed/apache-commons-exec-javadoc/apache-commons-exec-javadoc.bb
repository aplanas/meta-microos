SUMMARY = "Javadocs for apache-commons-exec"
DESCRIPTION = "This package contains the API documentation for apache-commons-exec."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-exec-javadoc-1.3-2.7.noarch.rpm"
RPM_HASH = "f77dc3ed36fcdd2702e6077221ab62a10e03f9282d7ed43cff6550b20d4adc2765bbc8e92d92a52a9e43dc84105021516f1dbe8ede884dde9f28f6895176fbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-exec-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
