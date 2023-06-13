SUMMARY = "Binary files of tex4ebook"
DESCRIPTION = "Binary files of tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37771"

RPM_NAME = "texlive-tex4ebook-bin-2023.20230311.svn37771-91.1.aarch64.rpm"
RPM_HASH = "f2b65d7c729820b0b8133c2668683a8d59b86836102283525a9a9faec49dbabb2268a1eda6c6ad0dc786dcd73528d53437c08df877477ec985f9786fe46942cd"

RPROVIDES:${PN} += "texlive-tex4ebook-bin \
texlive-tex4ebook-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-tex4ebook"

inherit rpm
