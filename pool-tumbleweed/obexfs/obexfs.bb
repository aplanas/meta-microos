SUMMARY = "FUSE based filesystem using ObexFTP"
DESCRIPTION = "ObexFS is a fuse (FUSE-based filesystem) using obexftp (ObexFTP) to \
access files on mobile phones."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "obexfs-0.12-3.6.aarch64.rpm"
RPM_HASH = "0f236f86cd98763d345bbda6ca1978be36ddd3161ccafe1ad9f430adaf047f81f31c5a1ace9e4220738d8761da77eaa797279de2f0a2b50cd8f925d6c78506cc"

RPROVIDES:${PN} += "obexfs \
obexfs(aarch-64)"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libobexftp.so.0()(64bit)"

inherit rpm
