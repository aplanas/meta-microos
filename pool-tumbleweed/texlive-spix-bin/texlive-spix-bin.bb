SUMMARY = "Binary files of spix"
DESCRIPTION = "Binary files of spix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55933"

RPM_NAME = "texlive-spix-bin-2023.20230311.svn55933-91.1.aarch64.rpm"
RPM_HASH = "36e25446a6421257c6cfaa979ae68bd7c70ef6859bf858804b21a879c41bd9fe829d5c2562056b07f9e95f9dcb36f0e46e22d5adf921b75da8631419dee68370"

RPROVIDES:${PN} += "texlive-spix-bin \
texlive-spix-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-spix"

inherit rpm
