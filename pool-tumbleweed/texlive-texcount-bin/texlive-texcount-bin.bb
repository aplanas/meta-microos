SUMMARY = "Binary files of texcount"
DESCRIPTION = "Binary files of texcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13013"

RPM_NAME = "texlive-texcount-bin-2023.20230311.svn13013-93.2.aarch64.rpm"
RPM_HASH = "2a32b4e3c039db80866f4ee69f18816b85ef43b98233fe97aa45301cad5388d73f5fc034c59bf0e79bfdd112e8f5ed507046dc414066bc8328e02fdfadf20861"

RPROVIDES:${PN} += "texlive-texcount-bin"

RDEPENDS:${PN} += "texlive-texcount"

inherit rpm
