SUMMARY = "Javadoc for super-csv"
DESCRIPTION = "This package contains javadoc for super-csv."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-javadoc-2.4.0-4.11.noarch.rpm"
RPM_HASH = "4188893e13d557d9a2a69576d7d6e0f52b10b8ee0b1c5432b372499af7edd9f8b24593189f9d76f9e82442b988f96599d8ae82c0b93f40cbb103e1c9211b1c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "super-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
