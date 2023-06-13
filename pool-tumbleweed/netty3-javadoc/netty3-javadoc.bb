SUMMARY = "API documentation for netty3"
DESCRIPTION = "API documentation for netty3."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "3.10.6"

RPM_NAME = "netty3-javadoc-3.10.6-14.10.noarch.rpm"
RPM_HASH = "d5f4c878cda1c730219827383bd0d76fdbf72301181b009e1d3e3c02d64604de7e6c29b651d9777e000826aee0fe4ece343c4e32f09fdc1c172431af0156ce42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netty3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
