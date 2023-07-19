SUMMARY = "Binary files of bibcop"
DESCRIPTION = "Binary files of bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65257"

RPM_NAME = "texlive-bibcop-bin-2023.20230311.svn65257-93.1.aarch64.rpm"
RPM_HASH = "873a94a95f3842e4826c87ead667579061d47731719821795ecd919280701c594f05173b7df63950b9c6199409b2c7299fb0b4f538b691898ebd5864b5e43473"

RPROVIDES:${PN} += "texlive-bibcop-bin"

RDEPENDS:${PN} += "texlive-bibcop"

inherit rpm
