SUMMARY = "Javadoc for picocli"
DESCRIPTION = "This package contains the API documentation for picocli."
LICENSE = "Apache-2.0"

PV = "4.6.2"

RPM_NAME = "picocli-javadoc-4.6.2-2.6.noarch.rpm"
RPM_HASH = "6cd6af3341aff96a219bd7aaac5c192a58f9b7d8d84d2858786f3372d9b1697e81d40d416cfd2d27e41ff3b72517b595ded23a0d17ee2e5dcb333f2bdc580225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picocli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
