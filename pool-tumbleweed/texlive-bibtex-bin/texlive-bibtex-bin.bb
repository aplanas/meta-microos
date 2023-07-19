SUMMARY = "Binary files of bibtex"
DESCRIPTION = "Binary files of bibtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "5bf009e01ac60e9eaf1c377317c48916071b1fa34c3df590133391a7404ed18f4f09983862b37c667923b26fd7d7a0796506e979eba98574bed8b53156ac3aef"

RPROVIDES:${PN} += "texlive-bibtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex"

inherit rpm
