SUMMARY = "Javadoc for glassfish-fastinfoset"
DESCRIPTION = "This package contains javadoc for glassfish-fastinfoset."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-javadoc-1.2.15-5.1.noarch.rpm"
RPM_HASH = "e4bc0861b6386b59f075327b068a7bfcf7b18c8d1ab08370d593de7a658aab08f2024508d8411f2f46adbac9ed112b1c4c0672bca9276054fe5da8fef1ef7936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
