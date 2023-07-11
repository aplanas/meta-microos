SUMMARY = "The Standard UNIX FTP Client"
DESCRIPTION = "This package provides the standard UNIX command line FTP client. FTP is \
the file transfer protocol, which is a widely used Internet protocol \
for transferring files. \
 \
 \
 \
Authors: \
-------- \
    David A. Holland <netbug@ftp.uk.linux.org>"
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "ftp-0.17-694.27.aarch64.rpm"
RPM_HASH = "a055bd5eaf11a3021ec39a9fa8dd8338be23ff0ce3a0ed01c4b45d57674dcf2b513ae61204816109392c7d014f3cee4ddaf54174391768f8e521e8ab69a94191"

RPROVIDES:${PN} += "ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
