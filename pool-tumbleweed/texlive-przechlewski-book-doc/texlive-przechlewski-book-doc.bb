SUMMARY = "Documentation for texlive-przechlewski-book"
DESCRIPTION = "This package includes the documentation for texlive-przechlewski-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23552"

RPM_NAME = "texlive-przechlewski-book-doc-2023.209.svn23552-53.1.noarch.rpm"
RPM_HASH = "8a2bce03ef4c997617d4f4857700c4c70d5e9ebf5a497708ab545ca1d9973c5f14f4ea4c530f31c3bc77963f205aa89baa5aeec7895257e225743055a41103f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-przechlewski-book-doc-en;pl \
texlive-przechlewski-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
