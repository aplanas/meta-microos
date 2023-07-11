SUMMARY = "Documentation for texlive-hyphen-greek"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-greek"
LICENSE = "LPPL-1.0"

PV = "2023.208.5svn58652"

RPM_NAME = "texlive-hyphen-greek-doc-2023.208.5svn58652-53.1.noarch.rpm"
RPM_HASH = "bf5c722ac31c9c175987bdf339679075c53e333f4adb4b8e1df1c2b45c22fecb2c9cba9e0a0e713cb4f334ad345af4497681264ce9dbc9a79d58d5307860d9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
