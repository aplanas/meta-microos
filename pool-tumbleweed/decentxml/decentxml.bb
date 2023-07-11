SUMMARY = "XML parser optimized for round-tripping and code reuse"
DESCRIPTION = "XML parser optimized for round-tripping and code reuse with main \
features being: \
 * Allows 100% round-tripping, even for weird whitespace between \
   attributes in the start tag or in the end tag \
 * Suitable for building editors and filters which want/need to \
   preserve the original file layout as much as possible \
 * Error messages have line and column information \
 * XML 1.1 compatible"
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "decentxml-1.4-4.11.noarch.rpm"
RPM_HASH = "d5efa058802f53962aa11051e1e26a56db794a6e325f261e31b11599881e08171699dcfdc6a3cbfd2624cf2d60d78e7729bc87575bb3e5300f53d36477033048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decentxml \
mvn-de.pdark-decentxml \
mvn-de.pdark-decentxml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
