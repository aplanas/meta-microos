SUMMARY = "Javadoc for jafama"
DESCRIPTION = "Javadoc for jafama."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "jafama-javadoc-2.3.1-1.19.noarch.rpm"
RPM_HASH = "e6411a20dc87e413e45795329c458dfbaf9b593304bcd6a8f8a4fea9a120cb1a4e41f74481feefc3e4524b2f0f5fb961a1dd39948b498c8cdee33b2d96bbf031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jafama-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
