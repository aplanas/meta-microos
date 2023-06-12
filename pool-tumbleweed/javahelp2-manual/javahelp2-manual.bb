SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-manual-2.0.05-32.5.noarch.rpm"
RPM_HASH = "49be12aa2a65391827ead6d68bd8e61f827928f1cf9d84d76b40b3c5d8aa1e13ce1890f552d0c52d40030aad2c051f97640eff8465f99990d5b90628cd719e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2-manual"
RDEPENDS:${PN} += ""

inherit rpm
