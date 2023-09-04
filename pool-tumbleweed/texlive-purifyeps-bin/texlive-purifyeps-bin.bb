SUMMARY = "Binary files of purifyeps"
DESCRIPTION = "Binary files of purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-purifyeps-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "20b8c90aeb3f71718fc1a9b5a55296e27c42add7c3f87a42689a2216cb897f0b00120ca2c966b16e555aed01de02c57b18e1ea2980373658942fdcb8adbd63cf"

RPROVIDES:${PN} += "texlive-purifyeps-bin"

RDEPENDS:${PN} += "texlive-purifyeps"

inherit rpm
