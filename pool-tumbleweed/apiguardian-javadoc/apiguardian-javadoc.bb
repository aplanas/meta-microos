SUMMARY = "Javadoc for apiguardian"
DESCRIPTION = "API documentation for apiguardian."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "apiguardian-javadoc-1.0.0-2.6.noarch.rpm"
RPM_HASH = "a3a998218489a6228aea9976c4dc7f442c2bbb311c0a3a32eb82e1ed2f92c4deb924d2dd7efa7379896242ef511acd1abd5868bf4c4a088444b883b1fc0f2b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apiguardian-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
