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

RPM_NAME = "decentxml-1.4-4.10.noarch.rpm"
RPM_HASH = "e5028cc9d4e01c299f0f08deeff7400934b55dc4f45ed7e7a43ecdc738fb01a7c7a3fc7aea3de7cb3047e0ed4d9f19a3d611d002aefee424fd059edab4ff15be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decentxml mvn(de.pdark:decentxml) mvn(de.pdark:decentxml:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
