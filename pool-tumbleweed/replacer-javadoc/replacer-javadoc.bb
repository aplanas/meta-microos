SUMMARY = "Javadoc for replacer"
DESCRIPTION = "This package contains javadoc for replacer."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "replacer-javadoc-1.6-3.11.noarch.rpm"
RPM_HASH = "6711f8c0cc318a925688299319c8d1f1c6c044ccd58056c9f28f17f8c305ad6c0f9701aa6b1d7481c14cd21c94cccf52138f51e46dc5e3ec41622c83dee88511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "replacer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
