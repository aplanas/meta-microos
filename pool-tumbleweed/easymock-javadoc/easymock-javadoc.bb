SUMMARY = "Javadoc for easymock"
DESCRIPTION = "Javadoc for easymock."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "easymock-javadoc-3.6-2.24.noarch.rpm"
RPM_HASH = "94d7536b0811ae1ba66a2cac0cca03296fb6324413f2470412e1a8542cd2a7bb2698fd82f6c553eeb4c216e078f91ca9d417e10b35bfeb494dd6d36c322ece6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easymock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
