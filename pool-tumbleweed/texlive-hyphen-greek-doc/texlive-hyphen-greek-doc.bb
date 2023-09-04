SUMMARY = "Documentation for texlive-hyphen-greek"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-greek"
LICENSE = "LPPL-1.0"

PV = "2023.209.5svn58652"

RPM_NAME = "texlive-hyphen-greek-doc-2023.209.5svn58652-54.1.noarch.rpm"
RPM_HASH = "7097058c54474e5f03bbda55a2149b743ca2a46b00512e36a1c39f585d32993e559fb7cd7791467d940ed3fdf38bbbaefeec0b72420ce1a9e3137b6bfc3c3190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
