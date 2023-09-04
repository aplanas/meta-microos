SUMMARY = "Binary files of dviasm"
DESCRIPTION = "Binary files of dviasm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8329"

RPM_NAME = "texlive-dviasm-bin-2023.20230311.svn8329-93.2.aarch64.rpm"
RPM_HASH = "93a612df4dcdf5b1c67ff696e802d23d3665ad90484f7ce67617f1cba2d844c2df99e0ebe0845accb34386729cc8cfed9d8c5c06eb62070091fa25abd8922299"

RPROVIDES:${PN} += "texlive-dviasm-bin"

RDEPENDS:${PN} += "texlive-dviasm"

inherit rpm
