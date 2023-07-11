SUMMARY = "Common Internet File System Client in 100% Java"
DESCRIPTION = "The jCIFS SMB client library enables any Java application to remotely \
access shared files and directories on SMB file servers(i.e. a \
Microsoft Windows 'share') in addition to domain, workgroup, and server \
enumeration of NetBIOS over TCP/IP networks. It is an advanced \
implementation of the CIFS protocol supporting Unicode, batching, \
multiplexing of threaded callers, encrypted authentication, \
transactions, the Remote Access Protocol (RAP), and much more. It is \
licensed under LGPL which means commercial organizations can \
legitimately use it with their proprietary code(you just can't sell or \
give away a modified binary only version of the library itself without \
reciprocation)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.19"

RPM_NAME = "jcifs-1.3.19-3.7.noarch.rpm"
RPM_HASH = "f640b327cd767dd8b24926c4d9bbed23cc79080c8ef8ed1df3cf4b4850a84fb6110f0ea877420e187262f64625b5e1d631464db6bad39ca4bfa1bdd3420b7278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs \
mvn-jcifs-jcifs \
mvn-jcifs-jcifs-pom- \
mvn-org.samba.jcifs-jcifs \
mvn-org.samba.jcifs-jcifs-pom- \
osgi-jcifs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api"

inherit rpm
