SUMMARY = "Binary files of ctan-o-mat"
DESCRIPTION = "Binary files of ctan-o-mat"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46996"

RPM_NAME = "texlive-ctan-o-mat-bin-2023.20230311.svn46996-92.1.aarch64.rpm"
RPM_HASH = "54fbede15b07cc75aac4787834640bedfabdce9c7ddfebc082149ecf557e3ba71227e58963c0b5c3e5e87af0a4e94efe2dca2f63597c84fcca7ab927e0a6a86a"

RPROVIDES:${PN} += "texlive-ctan-o-mat-bin"

RDEPENDS:${PN} += "texlive-ctan-o-mat"

inherit rpm
