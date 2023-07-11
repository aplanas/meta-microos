SUMMARY = "Javadoc for exec-maven-plugin"
DESCRIPTION = "API documentation for exec-maven-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "exec-maven-plugin-javadoc-3.0.0-4.4.noarch.rpm"
RPM_HASH = "69aa80881d1453fa3ee31276f105e03c1ad2ff83b6d18ced8cc305d8c3151033980e49eedc1f8c95d19869a85e451e255fb2d598649568eb5933ebfcb344d710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exec-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
