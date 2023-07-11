SUMMARY = "Javadoc for aqute-bnd"
DESCRIPTION = "API documentation for aqute-bnd."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "aqute-bnd-javadoc-5.2.0-3.2.noarch.rpm"
RPM_HASH = "12b844a1aacb4d315f9a27d30664341d05cdcb884f9c3a10b7e9162067d8004eea9a2581218af9f1216ad647f3e0849bc5afd530e8152ebc33528c45639e76be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bnd-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
