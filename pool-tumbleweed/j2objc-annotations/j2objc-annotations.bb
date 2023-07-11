SUMMARY = "J2ObjC Annotations"
DESCRIPTION = "A set of annotations that provide additional information to \
the J2ObjC translator to modify the result of translation."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "j2objc-annotations-2.2-1.5.noarch.rpm"
RPM_HASH = "00aec4985fb4acf1253e96d91383c69c3fbd7c87047d35be111aaa4f1b20e000dee02e4132c3ef08f98f27168963980ca504a86428eed665d0273d9f6f059a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "j2objc-annotations \
mvn-com.google.j2objc-j2objc-annotations \
mvn-com.google.j2objc-j2objc-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
