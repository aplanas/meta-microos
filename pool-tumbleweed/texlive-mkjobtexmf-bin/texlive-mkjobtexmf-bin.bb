SUMMARY = "Binary files of mkjobtexmf"
DESCRIPTION = "Binary files of mkjobtexmf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8457"

RPM_NAME = "texlive-mkjobtexmf-bin-2023.20230311.svn8457-92.1.aarch64.rpm"
RPM_HASH = "17170039e58556eb512f2af79cd07c5d2cff6b358d48483344eafa80c9b98e8555e038b93d3fc89c4b1dafe6e7782a39da3f535fe19d3137345672803debb6e4"

RPROVIDES:${PN} += "texlive-mkjobtexmf-bin"

RDEPENDS:${PN} += "texlive-mkjobtexmf"

inherit rpm
