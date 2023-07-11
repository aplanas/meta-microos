SUMMARY = "Development files for the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "libdlm-devel-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "bafa67f183a2cb8f76258b701e28de199f05dea4d37f84073e78266a64c9660673c08c814cadf572db52446e3f129a63140311f40218b555e8916ec3f68ffadd"

RPROVIDES:${PN} += "libdlm-devel \
pkgconfig-libdlm \
pkgconfig-libdlm-lt \
pkgconfig-libdlmcontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdlm3"

inherit rpm
