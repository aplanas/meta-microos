SUMMARY = "Javadoc for maven-invoker-plugin"
DESCRIPTION = "API documentation for maven-invoker-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-invoker-plugin-javadoc-3.2.2-1.10.noarch.rpm"
RPM_HASH = "3c52782e45579b9110754a7600e6736336dd9cddf2aae7874e44f59aca9322b43557f87e99ba6a1bdc0df1e289688c617fd95683d330cc44f979f81b5fd72c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
