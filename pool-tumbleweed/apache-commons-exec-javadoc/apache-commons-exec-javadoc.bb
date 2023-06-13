SUMMARY = "Javadocs for apache-commons-exec"
DESCRIPTION = "This package contains the API documentation for apache-commons-exec."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-exec-javadoc-1.3-2.6.noarch.rpm"
RPM_HASH = "c103b8776e85967263177029a09617fc78bb06c769488f939bd6864e527c043a05aaea513cabdb79afffcb526c7613fc3e76f0a10659481cc6bc7a9fd698bf61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-exec-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
