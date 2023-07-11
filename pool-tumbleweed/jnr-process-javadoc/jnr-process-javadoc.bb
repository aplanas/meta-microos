SUMMARY = "Javadocs for jnr-process"
DESCRIPTION = "This package contains the API documentation for jnr-process."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "jnr-process-javadoc-0.4.12-1.2.noarch.rpm"
RPM_HASH = "cf290989eabc70138220ef759f2963db7512add7f0605c6fcf0e7c3567294c8f21820b7f2e8e98ae12e689d864ab7f0919ad702629bf90727e43ab65991b553b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-process-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
