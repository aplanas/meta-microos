SUMMARY = "Javadoc for felix-scr"
DESCRIPTION = "This package contains javadoc for felix-scr."
LICENSE = "Apache-2.0"

PV = "2.1.16"

RPM_NAME = "felix-scr-javadoc-2.1.16-1.19.noarch.rpm"
RPM_HASH = "e7e1cd73820bd3daf1f63bbad4c71ff97e8330cd3b2896f9c26ecc8005a15888f98484ec11172001f2d0dc007683b27ee3f2b799915407382d551dc89012e410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
