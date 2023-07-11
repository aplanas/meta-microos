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

RPM_NAME = "jcifs-javadoc-1.3.19-3.7.noarch.rpm"
RPM_HASH = "28a237159966a2fe201ecb5cb043747903e53422f925e5c5a9dabc9e5d63df7622379df34198a4146a09613166c300443a754481f7ee2e668a644c0d2c74d484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
