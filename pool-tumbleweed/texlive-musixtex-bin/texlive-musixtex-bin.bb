SUMMARY = "Binary files of musixtex"
DESCRIPTION = "Binary files of musixtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37026"

RPM_NAME = "texlive-musixtex-bin-2023.20230311.svn37026-91.1.aarch64.rpm"
RPM_HASH = "bbb383a07d1eb4b092ce7289ea04820fd2aeaa2530465305b863a1c7bb15d37d64ae16873e09f43e4f55d7a199dd92a348bc3a7f0ffaefe0d56bd98973e66cae"

RPROVIDES:${PN} += "texlive-musixtex-bin"

RDEPENDS:${PN} += "texlive-m-tx-bin \
texlive-musixtex \
texlive-pmx-bin"

inherit rpm
