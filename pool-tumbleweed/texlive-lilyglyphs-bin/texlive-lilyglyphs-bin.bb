SUMMARY = "Binary files of lilyglyphs"
DESCRIPTION = "Binary files of lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31696"

RPM_NAME = "texlive-lilyglyphs-bin-2023.20230311.svn31696-92.1.aarch64.rpm"
RPM_HASH = "80103337e8446c214b56167099f09491d26eebcce35a1c829db8cea16cdc93b27234a70d097651a1ef835e23d25d183555dbbd0141ad78886509ace6973f4402"

RPROVIDES:${PN} += "texlive-lilyglyphs-bin"

RDEPENDS:${PN} += "texlive-lilyglyphs"

inherit rpm
