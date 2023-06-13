SUMMARY = "Javadoc for maven-osgi"
DESCRIPTION = "API documentation for maven-osgi."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "maven-osgi-javadoc-0.2.0-3.10.noarch.rpm"
RPM_HASH = "f85cadf8eb6f4a112b1da6047b3d9c4e7c443268754f4f24157c4267e06a45cc6b4bd0b3c942f1831ce2633e2e1521224da6c895743fb7479c5a036172c8ad67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-osgi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
