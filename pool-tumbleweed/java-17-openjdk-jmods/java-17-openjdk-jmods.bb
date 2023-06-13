SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-jmods-17.0.7.0-3.1.aarch64.rpm"
RPM_HASH = "11a1232070cbcd3001ba6db97868fc3947418c41f09391e649615a70183e12b397c9e10a23a261e2cfad218b053dede412096339a7ea819da6657e5278067df9"

RPROVIDES:${PN} += "java-17-openjdk-jmods \
java-17-openjdk-jmods(aarch-64)"

RDEPENDS:${PN} += "java-17-openjdk-devel"

inherit rpm
