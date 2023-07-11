SUMMARY = "Javadoc for maven-reporting-impl"
DESCRIPTION = "API documentation for maven-reporting-impl."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-impl-javadoc-3.1.0-1.13.noarch.rpm"
RPM_HASH = "bce97238ebc7be2a059472feb7e1419c4665603f91813a0ef650fc32bb3da8df3f18eb766ca91b8397a7b168d689431dc0257f3517a73bd17a0fd26ae4a838ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
