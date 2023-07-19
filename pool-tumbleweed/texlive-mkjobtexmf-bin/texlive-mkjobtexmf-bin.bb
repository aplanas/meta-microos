SUMMARY = "Binary files of mkjobtexmf"
DESCRIPTION = "Binary files of mkjobtexmf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8457"

RPM_NAME = "texlive-mkjobtexmf-bin-2023.20230311.svn8457-93.1.aarch64.rpm"
RPM_HASH = "5dee43fccf17a4503d659e63530be7b32553dc126f65bbedc39e181baaf8dee99d3e8a16d12f061303326619545c87bad973d8ab1f373b640db00b25b7e972a1"

RPROVIDES:${PN} += "texlive-mkjobtexmf-bin"

RDEPENDS:${PN} += "texlive-mkjobtexmf"

inherit rpm
