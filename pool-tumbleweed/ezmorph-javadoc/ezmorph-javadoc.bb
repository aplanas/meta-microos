SUMMARY = "Javadoc for ezmorph"
DESCRIPTION = "API documentation for ezmorph."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "ezmorph-javadoc-1.0.6-4.10.noarch.rpm"
RPM_HASH = "32098d98fd0515012bde5f00cc9621b03a719f5f13ce3fc18fd8f3d1a5e3bd75e5afd6f065114c605118df1620547211ef5973af2ba0c4bf625e8e8991b470c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ezmorph-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
