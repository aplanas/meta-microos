SUMMARY = "API documentation for netty3"
DESCRIPTION = "API documentation for netty3."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "3.10.6"

RPM_NAME = "netty3-javadoc-3.10.6-15.1.noarch.rpm"
RPM_HASH = "24d007ce92742f2b8ebc6a2a3b71ee29ffd0c3b0a7822f69ef66cadfd5b9deabc0ede04ae64135b4515dbb3b1d025280230d38080d0cb861226ea8d2f13e2c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netty3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
