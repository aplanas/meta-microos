SUMMARY = "Parent POM file for Apache Felix Specs"
DESCRIPTION = "Parent POM file for Apache Felix Specs."
LICENSE = "Apache-2.0"

PV = "6"

RPM_NAME = "felix-parent-6-2.11.noarch.rpm"
RPM_HASH = "4c8b8165f1c3b138de8e5c030948a5405c9ec9b25efbaa43d2845b148196a84a512e50eaaaac6ad1eb44547dcf2b703a40b57cba3eee2cab523e37e2788d22aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-parent mvn(org.apache.felix:felix-parent:pom:) mvn(org.apache.felix:felix:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache:apache:pom:)"

inherit rpm
