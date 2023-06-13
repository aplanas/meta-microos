SUMMARY = "Binary files of ptex2pdf"
DESCRIPTION = "Binary files of ptex2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29335"

RPM_NAME = "texlive-ptex2pdf-bin-2023.20230311.svn29335-91.1.aarch64.rpm"
RPM_HASH = "2680a4edb34e794f33eb83b6f7d6e5b8c30bd70631d4deb368c894ce29437a19b677745018a2ffa3e4a18a432acc8802f37c8f2d80f16c842a32734c00a3afe1"

RPROVIDES:${PN} += "texlive-ptex2pdf-bin \
texlive-ptex2pdf-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-ptex2pdf"

inherit rpm
