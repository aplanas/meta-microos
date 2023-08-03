SUMMARY = "Documentation for texlive-libertinus-type1"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-type1"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64958"

RPM_NAME = "texlive-libertinus-type1-doc-2023.209.svn64958-55.1.noarch.rpm"
RPM_HASH = "28dd862ddb27ad9aa652149bd068d111d50c0e8565999cf3a950c6596a3ee814256daf013b55cd101c63f47a5ddab2df1dc768494d3b85d76e94d6cbd184b10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
