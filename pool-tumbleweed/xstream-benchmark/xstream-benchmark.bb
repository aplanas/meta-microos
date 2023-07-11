SUMMARY = "The benchmark module for xstream"
DESCRIPTION = "This package contains the benchmark module for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-benchmark-1.4.20-1.4.noarch.rpm"
RPM_HASH = "f3f602dbee9d4d5c4c1e637855f524b441573a296413f3e380b05344e9c3cf068e368905e1d67060a227b34fe871b67b3d1592cb24eaf1cc130d797608fc9a6c"
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
