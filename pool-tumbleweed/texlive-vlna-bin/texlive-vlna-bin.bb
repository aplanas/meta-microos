SUMMARY = "Binary files of vlna"
DESCRIPTION = "Binary files of vlna"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-vlna-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "d2f9f32dcbc58816b72abe914b3bb71ee72fbe6021bf427da243d314b055e635cde0789ff3fffb0796c3eeff43e3c42c858fa2b95e3d89774c09cc2a10517966"

RPROVIDES:${PN} += "texlive-vlna-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-vlna"

inherit rpm
