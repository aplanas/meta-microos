SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-javadoc-2.0.05-32.6.noarch.rpm"
RPM_HASH = "77d03a5ca6b1dc7368716afc6627a7596fb4cafc7ef0978d01b073a1759bab393853a9e3a5541a0475c70dfa6cc26cd7e289d92a70d0696b127f06ab5f3bed52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
