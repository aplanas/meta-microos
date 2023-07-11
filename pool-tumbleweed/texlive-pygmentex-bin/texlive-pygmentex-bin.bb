SUMMARY = "Binary files of pygmentex"
DESCRIPTION = "Binary files of pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34996"

RPM_NAME = "texlive-pygmentex-bin-2023.20230311.svn34996-92.1.aarch64.rpm"
RPM_HASH = "f6082f604762d3ec49dce92df4f6dc7ff5c40d697e3a3880e5fbc78b78ce482bc70915e68bd37850664e6e70501e12b280dd7ae53303b78c9de14be298386a7d"

RPROVIDES:${PN} += "texlive-pygmentex-bin"

RDEPENDS:${PN} += "texlive-pygmentex"

inherit rpm
