SUMMARY = "Javadoc for cbi-plugins"
DESCRIPTION = "API documentation for cbi-plugins."
LICENSE = "EPL-1.0"

PV = "1.1.5"

RPM_NAME = "cbi-plugins-javadoc-1.1.5-4.8.noarch.rpm"
RPM_HASH = "3ef929e51c5e3f4e26e7446dcb275d2612907126815cdca09b80908f07a08b9e9395de254e2b67057f0ea060694ec12cb396c499d89f2a5a96f30672a5e5659a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cbi-plugins-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
