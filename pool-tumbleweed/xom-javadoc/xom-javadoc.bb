SUMMARY = "API documentation for xom"
DESCRIPTION = "This package provides API documentation for xom."
LICENSE = "LGPL-2.0-only"

PV = "1.3.9"

RPM_NAME = "xom-javadoc-1.3.9-1.1.noarch.rpm"
RPM_HASH = "34d6c559c4af26f7faf33aec6442a180e354f02a3b91f77c3bb1aa7863f02ed0df34271e9d543a45c893255e4c0393928020e14c9f68117d0804882e7325f401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
