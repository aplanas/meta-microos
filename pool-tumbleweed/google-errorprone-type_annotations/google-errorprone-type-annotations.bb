SUMMARY = "error-prone type annotations"
DESCRIPTION = "Google Error Prone type annotations"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-type_annotations-2.11.0-2.2.noarch.rpm"
RPM_HASH = "08e02403fd4bba0382abfcbf75d6cb7e377fe9c1ede2ba1f56a9bd30bac33c9468b4cea3add7618fa1406ad9c371d7b771e8f4303ccec14f1584c174decd3da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-type-annotations \
mvn-com.google.errorprone-error-prone-type-annotations \
mvn-com.google.errorprone-error-prone-type-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
