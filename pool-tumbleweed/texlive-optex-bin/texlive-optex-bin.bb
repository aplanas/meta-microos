SUMMARY = "Binary files of optex"
DESCRIPTION = "Binary files of optex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53804"

RPM_NAME = "texlive-optex-bin-2023.20230311.svn53804-93.2.aarch64.rpm"
RPM_HASH = "5ad719e48450cc22bb28166ab761d1ca2c00dd62fc68d6ff5ff3fc2d9c4c1e412baf8abde9cfbc4a003d8a90ab613d5fc4e4be5d7cf6c9e588b382e6790ed8cc"

RPROVIDES:${PN} += "texlive-optex-bin"

RDEPENDS:${PN} += "texlive-optex"

inherit rpm
