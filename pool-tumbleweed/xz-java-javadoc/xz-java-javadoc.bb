SUMMARY = "API documentation of Java XZ compression library"
DESCRIPTION = "This package contains the API documentation of xz-java."
LICENSE = "SUSE-Public-Domain"

PV = "1.9"

RPM_NAME = "xz-java-javadoc-1.9-1.3.noarch.rpm"
RPM_HASH = "870681686a37d3df667360c6ba8237f7df4c60f77404a2114337bc6f04f212a931268f51b9ea2f1acae2837db99d4896b3af413f4c660141b6a1e8b1097ffd39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xz-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
