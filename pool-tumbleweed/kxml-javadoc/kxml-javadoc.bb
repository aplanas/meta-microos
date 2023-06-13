SUMMARY = "Javadoc for kxml"
DESCRIPTION = "API documentation for kxml."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kxml-javadoc-2.3.0-19.9.noarch.rpm"
RPM_HASH = "838da53c595cd6c571fb6363962f32e31bc355190746df0e4375396b62fe2a3c88d73f249018aa00aaaf818dc83ca6acc5d394ccaf11f7a15058daef8eba67f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kxml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
