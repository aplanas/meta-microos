SUMMARY = "Binary files of match_parens"
DESCRIPTION = "Binary files of match_parens"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23500"

RPM_NAME = "texlive-match_parens-bin-2023.20230311.svn23500-93.1.aarch64.rpm"
RPM_HASH = "6baf4384621b4d1002e68e2401b50ebb89cb213842f2754aca528ab9ed9ddab38d49313445412598583f7f932969a6afe7ff6e2fe6722d554bcd2f3bd8122a3e"

RPROVIDES:${PN} += "texlive-match-parens-bin"

RDEPENDS:${PN} += "texlive-match-parens"

inherit rpm
