SUMMARY = "Binary files of lwarp"
DESCRIPTION = "Binary files of lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43292"

RPM_NAME = "texlive-lwarp-bin-2023.20230311.svn43292-91.1.aarch64.rpm"
RPM_HASH = "6612e558edadf29d3e223c0eae98832f3a0b4272f51b87d6f701556410b2ef747f8a13b9f573d296e1ceb32667084e479a61c60bd398472beeed90b0c166c1ab"

RPROVIDES:${PN} += "texlive-lwarp-bin \
texlive-lwarp-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-lwarp"

inherit rpm
