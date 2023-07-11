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

RPM_NAME = "jcifs-demo-1.3.19-3.7.noarch.rpm"
RPM_HASH = "1bd53c473e99b7ac6c60d1fb300f22a12b1584626ad2284d820e089ed4ba99af0d8fc0972d4bde622bb00b2990da967b3d430c8e871cc810bd0667e012fc0ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs-demo"

RDEPENDS:${PN} += "jcifs"

inherit rpm
