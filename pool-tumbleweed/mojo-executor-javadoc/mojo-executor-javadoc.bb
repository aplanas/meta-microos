SUMMARY = "Javadoc for mojo-executor"
DESCRIPTION = "API documentation for mojo-executor."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "mojo-executor-javadoc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "a521b829b5dff6ea0c861a784c419bae7c3c91acb61adea6c12161414a43a2eaea03ec43e6ba85b4855fbf00608ce9812382b6c14c5e65710064d3d448928ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-executor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
