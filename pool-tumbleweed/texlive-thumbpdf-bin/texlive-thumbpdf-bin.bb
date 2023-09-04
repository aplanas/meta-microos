SUMMARY = "Binary files of thumbpdf"
DESCRIPTION = "Binary files of thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6898"

RPM_NAME = "texlive-thumbpdf-bin-2023.20230311.svn6898-93.2.aarch64.rpm"
RPM_HASH = "67507c88ed430d776b34ecb61b77971cf63bda3a0a96402d0a8f9e9dd07e320cd8b564011ded5cbe5556d83e459d3700f58271a87f16675659951e0d45d9c8ee"

RPROVIDES:${PN} += "texlive-thumbpdf-bin"

RDEPENDS:${PN} += "texlive-thumbpdf"

inherit rpm
