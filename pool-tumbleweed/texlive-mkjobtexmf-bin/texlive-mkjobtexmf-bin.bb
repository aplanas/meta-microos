SUMMARY = "Binary files of mkjobtexmf"
DESCRIPTION = "Binary files of mkjobtexmf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8457"

RPM_NAME = "texlive-mkjobtexmf-bin-2023.20230311.svn8457-91.1.aarch64.rpm"
RPM_HASH = "dcd3bbba9e8f3f768af010b2f997fc372e43da682acbbdd0619fbd4304686b20094aa85b8969ede5a06f186ca6a3ecf134435c26aef6886e18d66d070a24a675"

RPROVIDES:${PN} += "texlive-mkjobtexmf-bin \
texlive-mkjobtexmf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mkjobtexmf"

inherit rpm
