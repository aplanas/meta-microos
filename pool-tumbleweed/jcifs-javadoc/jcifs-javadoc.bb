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

RPM_NAME = "jcifs-javadoc-1.3.19-3.6.noarch.rpm"
RPM_HASH = "9d3d1aead542ba09f2ef16d51e00d9e2e6c50ba04826160b3397d451dc5bde704d9c2cb37de019ffe9c246320b03560d367115947b4600162b7b59c647fd2fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
