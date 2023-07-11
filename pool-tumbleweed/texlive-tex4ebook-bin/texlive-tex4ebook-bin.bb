SUMMARY = "Binary files of tex4ebook"
DESCRIPTION = "Binary files of tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37771"

RPM_NAME = "texlive-tex4ebook-bin-2023.20230311.svn37771-92.1.aarch64.rpm"
RPM_HASH = "2207ac9f5183103959fbd50df93882765d8b00d9a187dbe72287197127054fa16db6231d402b7a7ebfb9837c279a00cbb223ed4c633c590f11ea40eefffa211b"

RPROVIDES:${PN} += "texlive-tex4ebook-bin"

RDEPENDS:${PN} += "texlive-tex4ebook"

inherit rpm
