SUMMARY = "API documentation for xmvn-connector"
DESCRIPTION = "This package provides API documentation for xmvn-connector."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-javadoc-4.2.0-3.1.noarch.rpm"
RPM_HASH = "df577c0d9dbbb90ae498bf0cfcafe1182b1d2564289025640c11724dbb25810f91003a922576571544236d35ededb44520c8845c1ef9b539ab4d611e70642ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
