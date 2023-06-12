SUMMARY = "Javadoc for jakarta-servlet"
DESCRIPTION = "API documentation for jakarta-servlet."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "5.0.0"

RPM_NAME = "jakarta-servlet-javadoc-5.0.0-1.7.noarch.rpm"
RPM_HASH = "8c5534b4c46b7f32bbe56872092520eb151108d53705e99c55b58eba1d4392747e60e0c208c9ce5fd0e58c687848edc8ffd11c580cd77e106c0dabf28603ab22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-servlet-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
