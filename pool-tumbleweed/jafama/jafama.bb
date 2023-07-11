SUMMARY = "A (Strict) FastMath class with 1e-15ish accuracy"
DESCRIPTION = "Jafama (Java Fast Math) is a Java library aiming at providing faster versions \
of java.lang.Math treatments, at the eventual cost of 1e-15ish accuracy errors \
but still handling special cases properly (NaN, +-Infinity, ties, etc.). \
It also provides additional features, such as angles normalization methods, \
inverse hyperbolic trigonometry, etc."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "jafama-2.3.1-1.19.noarch.rpm"
RPM_HASH = "27b40cc28502ebb67b21263919df437dc6414039a182c31cb943538848f4d4bf9b7c3ff6855ff6434ee10f417463a23052830c8a4d4535b7614640dc89e0ad3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jafama \
mvn-net.jafama-jafama \
mvn-net.jafama-jafama-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
