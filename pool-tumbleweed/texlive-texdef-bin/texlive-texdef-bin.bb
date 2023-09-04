SUMMARY = "Binary files of texdef"
DESCRIPTION = "Binary files of texdef"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45011"

RPM_NAME = "texlive-texdef-bin-2023.20230311.svn45011-93.2.aarch64.rpm"
RPM_HASH = "142d502e52343bd27b092c235fcf2163677603982ddfe0ad947fede500d7351fe61c20b1fa9674f71e536c687430768f164f2abfae145d8440e196ff0ca206df"

RPROVIDES:${PN} += "texlive-texdef-bin"

RDEPENDS:${PN} += "texlive-texdef"

inherit rpm
