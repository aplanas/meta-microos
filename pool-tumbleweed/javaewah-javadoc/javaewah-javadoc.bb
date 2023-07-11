SUMMARY = "Javadoc for javaewah"
DESCRIPTION = "API documentation for javaewah."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "javaewah-javadoc-1.1.6-2.11.noarch.rpm"
RPM_HASH = "31370f11c46f4bf423c41e4dd852b233a6a35faaa7b93171e47db9e265b24b2dbe517655a93fd0e1a5a119630651847ceb4fa2c8fb27fc63965eaf5a0da5dd3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
