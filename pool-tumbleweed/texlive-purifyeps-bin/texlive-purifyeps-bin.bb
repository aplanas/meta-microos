SUMMARY = "Binary files of purifyeps"
DESCRIPTION = "Binary files of purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-purifyeps-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "462ba0507b8d2aa15bc23a67d35dd104527beed904926c6d6f85c996d8cb167f251f912e6fcd02cc7cde2456c5dc73261f357473e45b73ce352ce725b058a111"

RPROVIDES:${PN} += "texlive-purifyeps-bin"

RDEPENDS:${PN} += "texlive-purifyeps"

inherit rpm
