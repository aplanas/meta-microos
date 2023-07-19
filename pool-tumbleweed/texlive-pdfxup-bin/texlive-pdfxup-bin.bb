SUMMARY = "Binary files of pdfxup"
DESCRIPTION = "Binary files of pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn40690"

RPM_NAME = "texlive-pdfxup-bin-2023.20230311.svn40690-93.1.aarch64.rpm"
RPM_HASH = "922d858010e9d84806f7235daf017872602853b703efe3c1552695f823ed57790a67cfdb0cb960056c4a547318cceb9335556e91c908ae766927404d4a9c4a31"

RPROVIDES:${PN} += "texlive-pdfxup-bin"

RDEPENDS:${PN} += "texlive-pdfxup"

inherit rpm
