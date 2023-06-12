SUMMARY = "Javadoc for swingx"
DESCRIPTION = "This package contains the API documentation for swingx."
LICENSE = "LGPL-2.0-only"

PV = "1.6.5.1"

RPM_NAME = "swingx-javadoc-1.6.5.1-1.10.noarch.rpm"
RPM_HASH = "65260e012a31c6fbfdcaa16c7eefa48edd8811c41534519f5e4d68aebf5263179fa6cef4fb2eca22f0e8f945c31fb797932d23ba7352d9a643fbecc689ded71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swingx-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
