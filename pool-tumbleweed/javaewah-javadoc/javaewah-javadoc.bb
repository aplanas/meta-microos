SUMMARY = "Javadoc for javaewah"
DESCRIPTION = "API documentation for javaewah."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "javaewah-javadoc-1.1.6-3.1.noarch.rpm"
RPM_HASH = "39330b04a64123595728c3671848b778c21914d72b1e481c1659c916996b6075732af980ca4203e81e20c4331784984ec2eef81026c9913edd32bab8474eff2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
