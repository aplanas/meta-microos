SUMMARY = "Javadoc for resteasy"
DESCRIPTION = "This package contains the API documentation for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-javadoc-3.0.26-3.11.noarch.rpm"
RPM_HASH = "ad0600b8d8f3e4a79b7c0091780a0431c981d5751b6bed2133af4caabb4f443f06ee5ba9c6d9da901e3d7f32e60b90bf838b3eb0bdbaa15a7e38ac24b9766357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "resteasy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
