SUMMARY = "Javadoc for jnr-posix"
DESCRIPTION = "Javadoc for jnr-posix."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-javadoc-3.1.16-2.1.noarch.rpm"
RPM_HASH = "1f9c8ca8e56132e2bb9e05dc870c4f5ba14cdb82c3539da28e5ea84bda7200ef1692fa7ec695efdea453d8432b4ff99b02a91df3b8da0a07a835416e1ce2d798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
