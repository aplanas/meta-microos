SUMMARY = "Javadoc for jboss-logmanager"
DESCRIPTION = "This package contains the API documentation for jboss-logmanager."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-javadoc-2.0.4-1.21.noarch.rpm"
RPM_HASH = "4ddc74bd80733c485888d548835e5761928081a6217e9f9d1a4d7630d7c339e700411ffefb70daeaf40d261547df1242569468b449add15eba379d47e4f28b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
