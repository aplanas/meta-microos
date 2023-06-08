SUMMARY = "API Documentation for ivy"
DESCRIPTION = "JavaDoc documentation for apache-ivy"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "apache-ivy-javadoc-2.5.1-1.2.noarch.rpm"
RPM_HASH = "275284a40bf17a06115efa82f60b6d91e84783adc1ff85704d54f6904d3659a42734bd4a2665963a8e4c0cee76661a261179f97aafcfe1335965cd140714bc89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
