SUMMARY = "Javadoc for jnacl"
DESCRIPTION = "This package contains API documentation for jnacl."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-javadoc-1.0.0-2.1.noarch.rpm"
RPM_HASH = "ba8240bcb931413c824f74b60040984c112915fc239fe5115c22ee664b5504d8f21b9948030446224355a3c6a17e0e876f2d8709716d9972391219b42243145b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
