SUMMARY = "Javadoc for saxon9"
DESCRIPTION = "Javadoc for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-javadoc-9.4.0.7-16.7.noarch.rpm"
RPM_HASH = "637ae149361584ba2a16c25fa638aeea2fcc5275e04961b1c125710cb739cc8d415baa01e20b27bdc77018854575aa758e7f522aa6aa77e40974c966a1f4866d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
