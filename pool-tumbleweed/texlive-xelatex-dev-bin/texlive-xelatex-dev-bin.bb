SUMMARY = "Binary files of xelatex-dev"
DESCRIPTION = "Binary files of xelatex-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-xelatex-dev-bin-2023.20230311.svn53999-93.1.aarch64.rpm"
RPM_HASH = "166a54907a689ed58bc2e817374f1508c667724ada2ec78fd2c6b7c8cfe87f768f3f7c03bde1cf9af978fc588f5779f7e5c771d125e067beb53807a33a580ce8"

RPROVIDES:${PN} += "texlive-xelatex-dev-bin"

RDEPENDS:${PN} += "texlive-xelatex-dev"

inherit rpm
