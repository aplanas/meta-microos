SUMMARY = "API documentation for beust-jcommander"
DESCRIPTION = "This package contains the API documentation for beust-jcommander."
LICENSE = "Apache-2.0"

PV = "1.82"

RPM_NAME = "beust-jcommander-javadoc-1.82-1.1.noarch.rpm"
RPM_HASH = "a2b8cba3742bf8441d6755c7282d79e34af80f32ed73b5a716b4e14eb83ef08bbebe4ad6bc34feab11a0043be164a2a22e5b7627baee82dd91155e76e85e7e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beust-jcommander-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
