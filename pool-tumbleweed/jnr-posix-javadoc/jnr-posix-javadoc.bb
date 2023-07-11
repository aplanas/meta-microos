SUMMARY = "Javadoc for jnr-posix"
DESCRIPTION = "Javadoc for jnr-posix."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-javadoc-3.1.16-2.2.noarch.rpm"
RPM_HASH = "6375af2c85d36f84ea331650230a3286aa004ffd9f7deb105f1e1bf89686a657ee26c9dd905e3e307cfe798d631e5361da945aeed54dc0a7424f444c71954620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
