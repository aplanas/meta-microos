SUMMARY = "Application interface to the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libdlm3-4.1.0-2.4.aarch64.rpm"
RPM_HASH = "1773b4eb9cf24b1d03f35400659b6338b8b7b9dabd4f03b29175139b0b9d39cab04b4ee54d587b4b980990208eb0b0b12b5947b5a185c41bcf07a41fb34b53dc"

RPROVIDES:${PN} += "libdlm-lt.so.3 \
libdlm.so.3 \
libdlm3 \
libdlmcontrol.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
