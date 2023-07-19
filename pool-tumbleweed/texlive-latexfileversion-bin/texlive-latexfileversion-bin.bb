SUMMARY = "Binary files of latexfileversion"
DESCRIPTION = "Binary files of latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25012"

RPM_NAME = "texlive-latexfileversion-bin-2023.20230311.svn25012-93.1.aarch64.rpm"
RPM_HASH = "32cb6ea165949c345c7f16b3da25b55bd8acca83c46206843746d7d6bec99bd5375b1e4aa272ace6f63bf5cab151f790eba1bbf299698fbc08aef87494dde4df"

RPROVIDES:${PN} += "texlive-latexfileversion-bin"

RDEPENDS:${PN} += "texlive-latexfileversion"

inherit rpm
