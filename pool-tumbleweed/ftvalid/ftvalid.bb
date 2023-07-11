SUMMARY = "Layout table validator"
DESCRIPTION = "Layout table validator \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftvalid-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "75c720b39e88191611b172fd2cd453ad62021a0799bedc88f7c96329cf7151c7f6a8f65c8e4583babb1fbdd946a3e9b96723acdd736ae2d73a6cd7c3811f478a"

RPROVIDES:${PN} += "ftvalid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
