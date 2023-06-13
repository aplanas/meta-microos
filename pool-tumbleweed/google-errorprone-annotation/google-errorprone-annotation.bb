SUMMARY = "@BugPattern annotation"
DESCRIPTION = "@BugPattern annotation for Google Error Prone"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-annotation-2.11.0-2.1.noarch.rpm"
RPM_HASH = "3838242cc47f042ea9b5575f0d98eedc3e0b0706f120c1071e3e396132a5b031bc7ffead96bc2bf985361205510e4ec017aa51504f126830522dad453106c473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotation \
mvn(com.google.errorprone:error_prone_annotation) \
mvn(com.google.errorprone:error_prone_annotation:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.guava:guava)"

inherit rpm
