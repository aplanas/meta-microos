SUMMARY = "Enhanced FTP Client"
DESCRIPTION = "tnftp is the FTP (File Transfer Protocol) client from NetBSD.  FTP is a widely \
used protocol for transferring files over the Internet and for archiving files. \
tnftp provides some advanced features beyond the Linux netkit ftp client, but \
maintains a similar user interface to the traditional ftp client.  It was \
formerly called lukemftp."
LICENSE = "BSD-3-Clause"

PV = "20230507"

RPM_NAME = "tnftp-20230507-1.1.aarch64.rpm"
RPM_HASH = "7ce8bc016e1030a5099667a754ea7349f7fbb911c570359b7657ab5ab6a238df8be2bf1d7686322c5eb8bc028ebb3e1239a06db21912dc852c0d817ee2880dda"

RPROVIDES:${PN} += "lukemftp \
nkitb-/usr/bin/ftp \
tnftp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libssl.so.3 \
update-alternatives"

inherit rpm
