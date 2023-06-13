SUMMARY = "API documentation for testng"
DESCRIPTION = "This package contains the API documentation for testng."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "testng-javadoc-7.4.0-3.2.noarch.rpm"
RPM_HASH = "036ceb92986c115e6a7b2dd458a9b30e79af8a0c7994b7f02b28850633b3d9ef065ab40873466b670e990ff4cf1b42db8496878af2ce1e4ff45871f5e18b0d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "testng-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
