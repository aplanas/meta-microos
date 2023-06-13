SUMMARY = "Documentation for texlive-hyphen-greek"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-greek"
LICENSE = "LPPL-1.0"

PV = "2023.201.5svn58652"

RPM_NAME = "texlive-hyphen-greek-doc-2023.201.5svn58652-52.1.noarch.rpm"
RPM_HASH = "8892637298148cb6f60b0ed3c6832399eac71e6bcb51951b1b284e102f309ed39c254192c1d11968cb706a5544d340de851be0e0278b6353ef9d48e894aa48c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
