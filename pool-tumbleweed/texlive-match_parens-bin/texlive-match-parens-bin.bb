SUMMARY = "Binary files of match_parens"
DESCRIPTION = "Binary files of match_parens"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23500"

RPM_NAME = "texlive-match_parens-bin-2023.20230311.svn23500-92.1.aarch64.rpm"
RPM_HASH = "8f6fc156e8606d1ba5858144e9edf8a59a350305d5549e4521e4d80de92740ca67024439e20c553003b870b142546eccac659be9adcfa0d00b56b08e5a9d2db4"

RPROVIDES:${PN} += "texlive-match-parens-bin"

RDEPENDS:${PN} += "texlive-match-parens"

inherit rpm
