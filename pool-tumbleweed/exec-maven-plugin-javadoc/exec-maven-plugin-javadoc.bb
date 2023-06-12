SUMMARY = "Javadoc for exec-maven-plugin"
DESCRIPTION = "API documentation for exec-maven-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "exec-maven-plugin-javadoc-3.0.0-4.3.noarch.rpm"
RPM_HASH = "86e8f91a92c1f9f1f570b17179c58edd1605d4d2c59068f655b0693cad6f14a22da8978409c83d045e4f0945e228ef5ce6412e9d4e707aac83b338e4d0686ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exec-maven-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
