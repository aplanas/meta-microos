SUMMARY = "Javadoc for librepository"
DESCRIPTION = "Javadoc for librepository."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "librepository-javadoc-1.1.6-1.4.noarch.rpm"
RPM_HASH = "9cae1604e4242412a0b4875c81a9c09d1e87fbda828e28220836782761d0d5f325417d93ef628c4dfdfa7a4008a50108b550310500435b1768414c2f803b65b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librepository-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
