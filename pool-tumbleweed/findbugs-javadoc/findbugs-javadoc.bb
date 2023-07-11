SUMMARY = "Javadoc documentation for findbugs"
DESCRIPTION = "Javadoc documentation for findbugs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "findbugs-javadoc-3.0.1-2.21.noarch.rpm"
RPM_HASH = "d0805f250120d03c7e2b67975077087a6aa3f4b3a0357570fdfa4b3ee3f0da22b0f99bb41031a3d098753dbdfa03965c867341cbfbb69d1a85e631ed32d3b1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
