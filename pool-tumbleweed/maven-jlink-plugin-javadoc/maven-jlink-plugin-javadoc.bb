SUMMARY = "Javadoc for maven-jlink-plugin"
DESCRIPTION = "API documentation for maven-jlink-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jlink-plugin-javadoc-3.0.0~alpha1-2.22.noarch.rpm"
RPM_HASH = "ac63af714d5ec2ed85600ccba47cad68b8b7dbbf57754eb015676635e6e62f9bf563116e406ef1fb730de14c1705a6ec471f1f069f6041302a4959846863178f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jlink-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
