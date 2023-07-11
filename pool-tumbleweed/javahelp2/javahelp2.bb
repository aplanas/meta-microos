SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-2.0.05-32.6.noarch.rpm"
RPM_HASH = "475b9d1f1204374aa0d70215c60fd157a7ed9ef00b5e77a4e59e62cb821cd9acd8ef2e83667205d0ca331e082d266ce11aaf4e4ce76a0bc9bcd995b16ed9f9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2 \
mvn-javax.help-javahelp"

RDEPENDS:${PN} += "/usr/bin/bash \
glassfish-jsp-api \
glassfish-servlet-api \
java-headless \
javapackages-filesystem"

inherit rpm
