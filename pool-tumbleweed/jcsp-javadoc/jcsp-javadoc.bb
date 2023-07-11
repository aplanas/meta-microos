SUMMARY = "Javadoc for jcsp"
DESCRIPTION = "This package contains javadoc for jcsp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1~rc5"

RPM_NAME = "jcsp-javadoc-1.1~rc5-3.11.noarch.rpm"
RPM_HASH = "4749bc4bf44ac44b5602b7ca5bf7e557e0619a5051812e541259e5d84355a462374eef67fe25705ce88b3ca3c8a08a49c4f7021140c571b0e2850d8f3ae142b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
