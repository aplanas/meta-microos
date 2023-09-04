SUMMARY = "Binary files of latexfileversion"
DESCRIPTION = "Binary files of latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25012"

RPM_NAME = "texlive-latexfileversion-bin-2023.20230311.svn25012-93.2.aarch64.rpm"
RPM_HASH = "c44fa0ce42379a234ddfb04ddc5522a4a1a503ea0d1fbe98c5879e75270e1a2af203ff6770e03d7a8a61e3e78449f9443d361f367994303a4d7fa051b5957f40"

RPROVIDES:${PN} += "texlive-latexfileversion-bin"

RDEPENDS:${PN} += "texlive-latexfileversion"

inherit rpm
