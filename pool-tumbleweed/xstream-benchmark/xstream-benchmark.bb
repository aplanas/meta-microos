SUMMARY = "The benchmark module for xstream"
DESCRIPTION = "This package contains the benchmark module for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-benchmark-1.4.20-2.1.noarch.rpm"
RPM_HASH = "d359d470369fab747886608dd2271f364bd7d3553a1bcbfe6cdcc220efaebcfbe38e43993cab6bcc35ab776964bf4c5bb7901246ac028a648550509d8a3fbdbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-benchmark \
mvn-com.thoughtworks.xstream-xstream-benchmark-pom- \
osgi-xstream-benchmark \
xstream-benchmark"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.xstream-xstream \
xstream"

inherit rpm
