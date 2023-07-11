SUMMARY = "API documentation for apache-sshd"
DESCRIPTION = "This package provides apache-sshd."
LICENSE = "Apache-2.0 & ISC"

PV = "2.9.2"

RPM_NAME = "apache-sshd-javadoc-2.9.2-2.4.noarch.rpm"
RPM_HASH = "526810e06ef0d3ed61709629a7d82ea5ceb88f60c6e02d504031165769367c6ba09d62fec42ec01c3ca9e304d4ea8f547738aa81e15b8fc8f5c24cf3c55a809d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
