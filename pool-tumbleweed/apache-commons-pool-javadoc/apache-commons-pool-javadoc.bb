SUMMARY = "Javadoc for apache-commons-pool"
DESCRIPTION = "The goal of Pool package it to create and maintain an object (instance) \
pooling package to be distributed under the ASF license. The package \
should support a variety of pool implementations, but encourage support \
of an interface that makes these implementations interchangeable. \
 \
This package contains the javadoc documentation for the Apache Commons \
Pool Package."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "apache-commons-pool-javadoc-1.6-5.15.noarch.rpm"
RPM_HASH = "7dcf049a80ab978e9a710340bc8382709c457730fcb5297390ded24dc562eced7ec8f3766d5c1e530a51f843f41c7643185987374b2e917e266aa19f29af848e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
