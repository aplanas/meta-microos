SUMMARY = "A collection of source code generators for Java"
DESCRIPTION = "The Auto sub-projects are a collection of code generators \
that automate those types of tasks."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-1.6.1-1.10.noarch.rpm"
RPM_HASH = "f58e5a319d71eb96a2b63b4f484b48de43f8675f37decc8b3382a36a5ddb5dd985ad07b1641417edf269b9e771f8220d2e9412592518bec23b45f289f106205e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto \
mvn-com.google.auto-auto-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
