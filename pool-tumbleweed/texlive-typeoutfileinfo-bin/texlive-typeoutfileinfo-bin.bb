SUMMARY = "Binary files of typeoutfileinfo"
DESCRIPTION = "Binary files of typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25648"

RPM_NAME = "texlive-typeoutfileinfo-bin-2023.20230311.svn25648-92.1.aarch64.rpm"
RPM_HASH = "25ce28f09ff3b6c3a8fe94baae8c0ccc62031d62441bb89aeacb216c77aae483314649489462092440ad5525c15ae2f66f8951b51705fff13abf22b7a3bd58f6"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-bin"

RDEPENDS:${PN} += "texlive-typeoutfileinfo"

inherit rpm
