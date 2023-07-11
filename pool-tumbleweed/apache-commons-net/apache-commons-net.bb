SUMMARY = "Internet protocol suite Java library"
DESCRIPTION = "This is an Internet protocol suite Java library originally developed by \
ORO, Inc.  This version supports Finger, Whois, TFTP, Telnet, POP3, FTP, \
NNTP, SMTP, and some miscellaneous protocols like Time and Echo as well \
as BSD R command support. The purpose of the library is to provide \
fundamental protocol access, not higher-level abstractions."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "apache-commons-net-3.9.0-1.3.noarch.rpm"
RPM_HASH = "ab71a9dbe82f06873e54bb300c6a93b4dc7d0efa55cb9d43e3d456d4734fedf1bffc607c9aea24b30837d45e2de710569a65ec4ec7050f4f65cdc6b14f5dd859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net \
commons-net \
jakarta-commons-net \
mvn-commons-net-commons-net \
mvn-commons-net-commons-net-pom- \
osgi-org.apache.commons.commons-net"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
