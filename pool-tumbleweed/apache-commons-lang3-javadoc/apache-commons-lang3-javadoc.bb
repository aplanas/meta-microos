SUMMARY = "Javadoc for apache-commons-lang3"
DESCRIPTION = "Javadoc for apache-commons-lang3."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "apache-commons-lang3-javadoc-3.12.0-2.7.noarch.rpm"
RPM_HASH = "48172f48f9a0e5c2ee5a268896c7c72ce3b6f37c61b4e34db51b263777ef90ff46a4eef51ddbf1245c7c34d35c7625e72a0bf284de89d8427501756cc3c9cce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
