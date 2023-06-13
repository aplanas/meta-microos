SUMMARY = "Javadoc for sac"
DESCRIPTION = "Javadoc for sac."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-javadoc-1.3-11.5.noarch.rpm"
RPM_HASH = "0563bb20199c5939e10f52e1e3b1894e77ff2221f09b40c359e1825e5e154aabcb8f85a2673a948e897f1a87bcab84132178d7fbad45fbe346ce4065bfc08a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sac-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
