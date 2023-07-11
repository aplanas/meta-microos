SUMMARY = "Javadoc for buildnumber-maven-plugin"
DESCRIPTION = "API documentation for buildnumber-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "1.3"

RPM_NAME = "buildnumber-maven-plugin-javadoc-1.3-2.11.noarch.rpm"
RPM_HASH = "4f684c1f4eebb163dee18ce80ce0436a3121a70ecf9bc01f7c07e9318c1622f7c0a51d5ed00c717f4a6d75a8e264a60866a2eee556b8f25e212af19c0800e558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildnumber-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
