SUMMARY = "Javadoc for jatl"
DESCRIPTION = "This package contains javadoc for jatl."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "jatl-javadoc-0.2.2-3.10.noarch.rpm"
RPM_HASH = "e5911e195aa1138f3457470d0d81e4caa0541b34120bbadc0eefe493b5e8af6cd8f7da36b2a529ddb650d9e38361607782569afdeb2f6e569ad39abad9c8ba24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jatl-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
