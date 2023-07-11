SUMMARY = "Binary files of latex-bin"
DESCRIPTION = "Binary files of latex-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54358"

RPM_NAME = "texlive-latex-bin-bin-2023.20230311.svn54358-92.1.aarch64.rpm"
RPM_HASH = "0156002c9ac5d9275176b31057242111e8650a87831f13ef7c04c357eb7515c3ed892279934059cc9f65cca1b64bacbc54db6329c582c936d0a7ccad55c7bacc"

RPROVIDES:${PN} += "texlive-latex-bin-bin"

RDEPENDS:${PN} += "texlive-latex-bin"

inherit rpm
