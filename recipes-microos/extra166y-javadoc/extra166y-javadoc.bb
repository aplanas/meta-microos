SUMMARY = "Javadoc for extra166y"
DESCRIPTION = "This package contains javadoc for extra166y."
LICENSE = "SUSE-Public-Domain"

PV = "1.7.0"

RPM_NAME = "extra166y-javadoc-1.7.0-3.9.noarch.rpm"
RPM_HASH = "ae42cb3202d6ddf24ce18f0287b5a6d9a6bf5d35adeeb37b7eb3fa295ce8ce28525e3539e58ed70c0a6e2b02a95b51ad0ab8e0f7e6d314a11e495837bb7ee8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra166y-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
