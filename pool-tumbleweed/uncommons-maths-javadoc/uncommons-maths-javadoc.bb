SUMMARY = "Javadoc for uncommons-maths"
DESCRIPTION = "This package contains javadoc for uncommons-maths."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-javadoc-1.2.3-2.1.noarch.rpm"
RPM_HASH = "6fd77134160c5c85006c6addead982bbae08ecd2b03811f1e8bfc6b76280439fb4f2f4ef85a088eee3f1e8773d065a25b16b799475b0fa61ac7a466a744cab17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uncommons-maths-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
