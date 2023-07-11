SUMMARY = "@BugPattern annotation processor"
DESCRIPTION = "JSR-269 annotation processor for @BugPattern annotation"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-docgen_processor-2.11.0-2.2.noarch.rpm"
RPM_HASH = "3b9c5fd9d2d9eed8ac6466a536fcb0d1ba666afb88d2d24b7ec208d97fe36df4989ad2bf892127ceb412870190379e0474fa8432a79e5b1c935e832bd4f059fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-docgen-processor \
mvn-com.google.errorprone-error-prone-docgen-processor \
mvn-com.google.errorprone-error-prone-docgen-processor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.code.gson-gson \
mvn-com.google.errorprone-error-prone-annotation \
mvn-com.google.guava-guava"

inherit rpm
