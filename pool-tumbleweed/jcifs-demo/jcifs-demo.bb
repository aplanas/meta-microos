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

RPM_NAME = "jcifs-demo-1.3.19-3.6.noarch.rpm"
RPM_HASH = "5a7917a22cfc8b4b1a107bc1be56f54154e0ec223ddd93958a7e535799e3fa9f9f6751fe60b34919ca9d64435a8de2ebb26f1262e840079d509fe06fe4380f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs-demo"
RDEPENDS:${PN} += "jcifs"

inherit rpm
