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

RPM_NAME = "ftp-0.17-694.26.aarch64.rpm"
RPM_HASH = "47abd3935af1136210214af68bb0bf910bc51eff1dba776613072bbcb8243518e9a62c0e92f6d432cf7bc508661535cf79a99df73a18cb7156b4b086a9713a7d"

RPROVIDES:${PN} += "ftp \
ftp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
