SUMMARY = "Javadoc for trilead-ssh2"
DESCRIPTION = "API documentation for trilead-ssh2."
LICENSE = "BSD-3-Clause & MIT"

PV = "217.8"

RPM_NAME = "trilead-ssh2-javadoc-217.8-2.7.noarch.rpm"
RPM_HASH = "5d85d3e0b1d0625b17feaa9c9481cd97fb64303ee99bb0a2f89206f7bcd4a159bcb39fa54a5cd8c597f541d6c432e828e1278d6bcc6ea9345e09f2ed21a288a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilead-ssh2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
