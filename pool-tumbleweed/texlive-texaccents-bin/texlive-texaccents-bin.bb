SUMMARY = "Binary files of texaccents"
DESCRIPTION = "Binary files of texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64447"

RPM_NAME = "texlive-texaccents-bin-2023.20230311.svn64447-91.1.aarch64.rpm"
RPM_HASH = "45c1b19027ba0c72edd762c14c1623a17ebac64dbf9fe739cedeb3836edae5e21b316d0fc439a2a399a9a1adfca4cdaefb8196c4cc1ea2753ca0636c71a0bc23"

RPROVIDES:${PN} += "texlive-texaccents-bin \
texlive-texaccents-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texaccents"

inherit rpm
