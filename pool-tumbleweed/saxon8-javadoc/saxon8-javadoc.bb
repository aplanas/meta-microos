SUMMARY = "Javadoc for saxon8"
DESCRIPTION = "Javadoc for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-javadoc-B.8.8-133.7.noarch.rpm"
RPM_HASH = "03cd3568e24f04ea51baa3465d97f94b252ecdc6e4ae0e4360487e030a44db941c72c0e80c328c8b4ebfcb140a3b65fa36649aa6729f766bf84ee23cc308c944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
