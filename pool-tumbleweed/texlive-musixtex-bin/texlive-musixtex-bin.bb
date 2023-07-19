SUMMARY = "Binary files of musixtex"
DESCRIPTION = "Binary files of musixtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37026"

RPM_NAME = "texlive-musixtex-bin-2023.20230311.svn37026-93.1.aarch64.rpm"
RPM_HASH = "bfd6cb05faf9059e9bd689ed7f37224acaea035012fa7e75c979d0c452f30d1027ceb2ec7190fd3e6fdf5ca8651e343d2c45e2874ec38ccfdf898d51756abfe2"

RPROVIDES:${PN} += "texlive-musixtex-bin"

RDEPENDS:${PN} += "texlive-m-tx-bin \
texlive-musixtex \
texlive-pmx-bin"

inherit rpm
