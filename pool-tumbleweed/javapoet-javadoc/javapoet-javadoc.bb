SUMMARY = "Javadoc for javapoet"
DESCRIPTION = "This package contains javadoc for javapoet."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "javapoet-javadoc-1.13.0-1.2.noarch.rpm"
RPM_HASH = "958d0e5c70689dc64e3eda5d7f88bbe1c5ee1b64358020001971cb10de350319f3ac544c1e1cedda31f6cfa0d0889d4033e438e43fe0714e2eceaeb0edabb044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapoet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
