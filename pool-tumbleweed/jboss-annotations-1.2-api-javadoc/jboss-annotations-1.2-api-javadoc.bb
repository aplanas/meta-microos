SUMMARY = "Javadoc for jboss-annotations-1.2-api"
DESCRIPTION = "This package contains javadoc for jboss-annotations-1.2-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.2"

RPM_NAME = "jboss-annotations-1.2-api-javadoc-1.0.2-2.7.noarch.rpm"
RPM_HASH = "25ee4c8c24c84b8d75cac84b6d99956be17f45a91515e6617ab894a2067a24eda899996f5d3d07f0cc1ddbb20539c194494659ea440bcb130dd11c82659c2207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-annotations-1.2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
