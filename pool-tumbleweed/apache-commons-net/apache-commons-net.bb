SUMMARY = "Internet protocol suite Java library"
DESCRIPTION = "This is an Internet protocol suite Java library originally developed by \
ORO, Inc.  This version supports Finger, Whois, TFTP, Telnet, POP3, FTP, \
NNTP, SMTP, and some miscellaneous protocols like Time and Echo as well \
as BSD R command support. The purpose of the library is to provide \
fundamental protocol access, not higher-level abstractions."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "apache-commons-net-3.9.0-1.2.noarch.rpm"
RPM_HASH = "dd29fe02c095016764233565e8f289d81127eae5a8933a9c4449d09e22748964fa3d249987265decb1068ce3e58326e1110b6c6a8da9fe2eed964f83e4f4e68b"
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
