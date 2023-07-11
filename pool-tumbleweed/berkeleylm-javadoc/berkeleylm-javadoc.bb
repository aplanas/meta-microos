SUMMARY = "API documentation for berkeleylm"
DESCRIPTION = "This package contains the API documentation for berkeleylm."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "berkeleylm-javadoc-1.1.6-2.7.noarch.rpm"
RPM_HASH = "0268b542f9e47eab5b3da35eee55bb16c6070bbaa44eec00a09994cbc190e0c11e9826d13f695c8967d8621bea910eac145a66fa67ae25e710ec69b64fa75117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleylm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
