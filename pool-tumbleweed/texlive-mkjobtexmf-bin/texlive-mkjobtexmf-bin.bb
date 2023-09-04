SUMMARY = "Binary files of mkjobtexmf"
DESCRIPTION = "Binary files of mkjobtexmf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8457"

RPM_NAME = "texlive-mkjobtexmf-bin-2023.20230311.svn8457-93.2.aarch64.rpm"
RPM_HASH = "ff87db54215f23f45608df9af5c1b309010af3c016c49a91d4b87811c89a792a580a395f32aad732f200b7f7a37e538be348cba0378192e36188f7617cb1b3b3"

RPROVIDES:${PN} += "texlive-mkjobtexmf-bin"

RDEPENDS:${PN} += "texlive-mkjobtexmf"

inherit rpm
