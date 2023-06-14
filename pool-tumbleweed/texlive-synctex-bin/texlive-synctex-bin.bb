SUMMARY = "Binary files of synctex"
DESCRIPTION = "Binary files of synctex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-synctex-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "521a9c3532296db2f906415174c0f34d23bc0a470ebe387498169a4a9dd4589eff1f9a199533b3d05b542737cf484b974ab952b48625c2f54d20ccbeb30f1abd"

RPROVIDES:${PN} += "texlive-synctex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsynctex.so.2 \
texlive-synctex"

inherit rpm
