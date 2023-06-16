SUMMARY = "Tools to access MS-DOS filesystems without kernel drivers"
DESCRIPTION = "Mtools allows access to an MS-DOS file system on disk without \
mounting it. It includes commands for working with MS-DOS files: \
mdir, mcd, mcopy, and mformat. \
 \
XDF support for OS/2 is also provided."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.43"

RPM_NAME = "mtools-4.0.43-1.1.aarch64.rpm"
RPM_HASH = "a7aaf5c967df31aae435a891a41440942882417181a23faba0675ad22d0600e51bd1583bdaa5146c1a2ef1f8f6a0bcecdcdce1995bce510be507ee3abd00495b"

RPROVIDES:${PN} += "config-mtools \
mtools"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
