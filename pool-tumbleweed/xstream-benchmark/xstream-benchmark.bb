SUMMARY = "The benchmark module for xstream"
DESCRIPTION = "This package contains the benchmark module for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-benchmark-1.4.20-1.3.noarch.rpm"
RPM_HASH = "18663e5e6927094e652281de9adb12d6e1f521efdcf3114de06491721b5e209f982f2f1d52d6f128d16bbdee53164eb0e197a8c6553ae6f465be3b9c6242ac09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.xstream:xstream-benchmark) \
mvn(com.thoughtworks.xstream:xstream-benchmark:pom:) \
osgi(xstream-benchmark) \
xstream-benchmark"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.xstream:xstream) \
xstream"

inherit rpm
