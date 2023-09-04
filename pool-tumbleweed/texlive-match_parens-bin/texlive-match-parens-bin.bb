SUMMARY = "Binary files of match_parens"
DESCRIPTION = "Binary files of match_parens"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23500"

RPM_NAME = "texlive-match_parens-bin-2023.20230311.svn23500-93.2.aarch64.rpm"
RPM_HASH = "8f1b53bb323bb61564377d42f8b5403f4b8c70b125d0d0a8482a309ce6704007884f6fadc9765d1b78cce5ee676b16cdcc311c12849b80c92d026e87465eb51f"

RPROVIDES:${PN} += "texlive-match-parens-bin"

RDEPENDS:${PN} += "texlive-match-parens"

inherit rpm
