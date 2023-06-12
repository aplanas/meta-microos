SUMMARY = "Binary files of glossaries"
DESCRIPTION = "Binary files of glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37813"

RPM_NAME = "texlive-glossaries-bin-2023.20230311.svn37813-91.1.aarch64.rpm"
RPM_HASH = "9d1b2b34f43bbc6abb761f043e60dfc35a214a0a2a1f623e1082cf29ac2900eeee055d566c41cf2adae6c53fe38ee9af4e9925971f6b2d3978d00b904855cfa9"

RPROVIDES:${PN} += "texlive-glossaries-bin \
texlive-glossaries-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-glossaries"

inherit rpm
