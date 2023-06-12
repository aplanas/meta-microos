SUMMARY = "@BugPattern annotation processor"
DESCRIPTION = "JSR-269 annotation processor for @BugPattern annotation"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-docgen_processor-2.11.0-2.1.noarch.rpm"
RPM_HASH = "8e3ae7e5123860c20d65290070b9765bc0c105bd749737153f74dec32a148d439d7c7701313106b3df9cb51dca2492b7847d4758221cd0ba4419b8a0f917cb26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-docgen_processor \
mvn(com.google.errorprone:error_prone_docgen_processor) \
mvn(com.google.errorprone:error_prone_docgen_processor:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.auto.service:auto-service-annotations) \
mvn(com.google.code.gson:gson) \
mvn(com.google.errorprone:error_prone_annotation) \
mvn(com.google.guava:guava)"

inherit rpm
