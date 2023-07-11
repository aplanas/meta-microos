SUMMARY = "Javadoc for java-jwt"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "MIT"

PV = "3.8.3"

RPM_NAME = "java-jwt-javadoc-3.8.3-1.19.noarch.rpm"
RPM_HASH = "2a5371dad75fe9118e47474c2a69af9ae6d654b8a2739dae391aa561b82392406b42581127ec910b168fa9f816a47396cfcb681e611e41defd0e28e6012c1a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-jwt-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
