SUMMARY = "Binary files of citation-style-language"
DESCRIPTION = "Binary files of citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64151"

RPM_NAME = "texlive-citation-style-language-bin-2023.20230311.svn64151-92.1.aarch64.rpm"
RPM_HASH = "040e777ce61c0efff952f4c13d16ca365a5d0a4c3eb40b45d94c70b57cfcce397763e35ec65f7b1dfac92f9020d3024d9c63e93eddc2fa4fa460f0e530bc5a86"

RPROVIDES:${PN} += "texlive-citation-style-language-bin"

RDEPENDS:${PN} += "texlive-citation-style-language"

inherit rpm
