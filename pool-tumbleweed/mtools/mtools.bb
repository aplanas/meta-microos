SUMMARY = "Tools to access MS-DOS filesystems without kernel drivers"
DESCRIPTION = "Mtools allows access to an MS-DOS file system on disk without \
mounting it. It includes commands for working with MS-DOS files: \
mdir, mcd, mcopy, and mformat. \
 \
XDF support for OS/2 is also provided."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.43"

RPM_NAME = "mtools-4.0.43-1.2.aarch64.rpm"
RPM_HASH = "31bb879dcc41dae342754cf6bed3da9ae4ae055c8a6b776b916208d8c271f6d4759207c6e8401d09ad49067d627144ef59f3f3762dd10f69ce6d23e9af02a8a6"

RPROVIDES:${PN} += "config-mtools \
mtools"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
