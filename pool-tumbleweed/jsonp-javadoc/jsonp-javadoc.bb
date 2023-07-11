SUMMARY = "Javadoc for jsonp"
DESCRIPTION = "This package contains javadoc for jsonp."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.4"

RPM_NAME = "jsonp-javadoc-1.0.4-3.11.noarch.rpm"
RPM_HASH = "e5e16a91442b12d1021b2ed394872e6a54e5b46b36acf0a58736c9ceef3bdfed7c21e7dd38d4ba309f04421c88e003522ef69aafee9f11694073d05340f0dc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsonp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
