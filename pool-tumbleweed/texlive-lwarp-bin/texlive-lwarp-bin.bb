SUMMARY = "Binary files of lwarp"
DESCRIPTION = "Binary files of lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43292"

RPM_NAME = "texlive-lwarp-bin-2023.20230311.svn43292-93.2.aarch64.rpm"
RPM_HASH = "73cf5872f0da2eed25f9ed877f0bceb176e945d4fbe2a3b4a09b8882e97f4b821d4500c3856cb491594e578ece64cd8a03a91a01d6b8c103081f66f2296f99c3"

RPROVIDES:${PN} += "texlive-lwarp-bin"

RDEPENDS:${PN} += "texlive-lwarp"

inherit rpm
