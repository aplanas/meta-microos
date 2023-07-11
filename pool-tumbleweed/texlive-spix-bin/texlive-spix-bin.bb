SUMMARY = "Binary files of spix"
DESCRIPTION = "Binary files of spix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55933"

RPM_NAME = "texlive-spix-bin-2023.20230311.svn55933-92.1.aarch64.rpm"
RPM_HASH = "b9c0409f74ec0c9a0cff4f5c970223ba03a063a9535c863be3b19099a0f55f77e49a688142ff55c67ff9381ba8bf861302bfd8433025ead81a5d4b6c61aec392"

RPROVIDES:${PN} += "texlive-spix-bin"

RDEPENDS:${PN} += "texlive-spix"

inherit rpm
