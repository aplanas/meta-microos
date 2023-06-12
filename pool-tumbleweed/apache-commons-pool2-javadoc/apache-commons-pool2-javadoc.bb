SUMMARY = "Javadoc for apache-commons-pool2"
DESCRIPTION = "The goal of Pool 2.x package it to create and maintain an object (instance) \
pooling package to be distributed under the ASF license. The package \
should support a variety of pool implementations, but encourage support \
of an interface that makes these implementations interchangeable. \
 \
This package contains the javadoc documentation for the Apache Commons \
Pool 2.x Package."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "apache-commons-pool2-javadoc-2.4.2-5.15.noarch.rpm"
RPM_HASH = "acd78893894333852a0cf6ef2e3c36af3ac5b2bf92dfec9fe18bd77904623d66ff34831b07f7fe6cc03b29a08b41fc93a11c6672678282147b66d6f0cbf86f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool2-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
