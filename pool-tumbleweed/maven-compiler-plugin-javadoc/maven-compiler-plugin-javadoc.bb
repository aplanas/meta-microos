SUMMARY = "Javadoc for maven-compiler-plugin"
DESCRIPTION = "API documentation for maven-compiler-plugin."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "maven-compiler-plugin-javadoc-3.10.1-1.12.noarch.rpm"
RPM_HASH = "8cf947300b18a05050615e68c19878476542e64ed3098c84be982c77202f646405ac27cc8f5ed26955e85e951df6cb35d74db34f84f14965f4719a90629451c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-compiler-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
