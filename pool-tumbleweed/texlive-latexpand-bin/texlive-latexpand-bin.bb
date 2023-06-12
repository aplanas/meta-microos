SUMMARY = "Binary files of latexpand"
DESCRIPTION = "Binary files of latexpand"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27025"

RPM_NAME = "texlive-latexpand-bin-2023.20230311.svn27025-91.1.aarch64.rpm"
RPM_HASH = "3c46c70bc5ac137cd730932f49c2495041d0900332b1049b7a0f700863cc5b8f8a5d3ef2ef9194d135020a5e8bc689cb7977efb9411d234d70966e446ccdd743"

RPROVIDES:${PN} += "texlive-latexpand-bin \
texlive-latexpand-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexpand"

inherit rpm
