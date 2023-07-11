SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-manual-2.0.05-32.6.noarch.rpm"
RPM_HASH = "f9ccea3f23417fc1f2ff560a657c309f8d918fc777484051c0926b4243e7d9bce19f3095fc44307cbf6cc7a6df45ec2ea4e2937e185991a15877afc77a4cf62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2-manual"

RDEPENDS:${PN} += ""

inherit rpm
