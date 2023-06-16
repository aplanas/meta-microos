SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-2.0.05-32.5.noarch.rpm"
RPM_HASH = "071533f6386f4510c1e5a65a56e1da20799f3a29736fbf44e9e6e8d777e23fa582b8c6efd2cf8fd36a866643a8ac4ad87295c9a9422d3c35fdbaab9b2452abac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2 \
mvn-javax.help-javahelp"

RDEPENDS:${PN} += "/usr/bin/bash \
glassfish-jsp-api \
glassfish-servlet-api \
java-headless \
javapackages-filesystem"

inherit rpm
