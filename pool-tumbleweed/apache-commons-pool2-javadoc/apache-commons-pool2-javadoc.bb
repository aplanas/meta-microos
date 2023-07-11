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

RPM_NAME = "apache-commons-pool2-javadoc-2.4.2-5.16.noarch.rpm"
RPM_HASH = "4ed9ce4fec27fa6bbb503263ca9a7b3bd801658122632b670ffb065df81de02e392a769ad8508ce6fab33e4042b2e772105ec71189de0f1a1f1c1e5b4d4f8e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
