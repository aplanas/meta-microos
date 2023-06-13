SUMMARY = "API documentation for sqlite-jdbc"
DESCRIPTION = "API documentation for sqlite-jdbc."
LICENSE = "Apache-2.0"

PV = "3.42.0.0"

RPM_NAME = "sqlite-jdbc-javadoc-3.42.0.0-1.1.noarch.rpm"
RPM_HASH = "0416f85c2f598da3b6c231f44c34ebfce5e566b02eb0c8f9cac08def75bda49614ddeb54f1a56577c6c04f1a43df2a8d518b6b6ef0f979a8e011302b67afee78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
