SUMMARY = "Javadoc for maven2"
DESCRIPTION = "Javadoc for maven2."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven2-javadoc-2.2.1-3.8.noarch.rpm"
RPM_HASH = "c65446c1732d7f81ef2a84708bb98d49a484b81efc2a019d9fc489479a4b67926829ba35e0153f75d1e1ac7b5f6c180ef9f4e21b729c03d22b92704dacb553e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
