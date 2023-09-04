SUMMARY = "Javadoc for freemarker"
DESCRIPTION = "This package contains the API documentation for freemarker."
LICENSE = "Apache-2.0"

PV = "2.3.31"

RPM_NAME = "freemarker-javadoc-2.3.31-4.1.noarch.rpm"
RPM_HASH = "d73bf88e70d594b4e24e096775fa62f483bc3b1895ea6f243344f977554116719236567ac0666a30cb8498238e16472795fd0d012a249c0bee571377f02d0c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freemarker-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
