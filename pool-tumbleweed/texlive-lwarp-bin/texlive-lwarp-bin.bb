SUMMARY = "Binary files of lwarp"
DESCRIPTION = "Binary files of lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43292"

RPM_NAME = "texlive-lwarp-bin-2023.20230311.svn43292-93.1.aarch64.rpm"
RPM_HASH = "823de9f6463a5839592c5fc04cdf9c48261c593418158bf0c531769d5338a88a2b9e16701e014d229cd6814ce459258fb25e7f8a9eecae236c4f0fcd68a9dda1"

RPROVIDES:${PN} += "texlive-lwarp-bin"

RDEPENDS:${PN} += "texlive-lwarp"

inherit rpm
