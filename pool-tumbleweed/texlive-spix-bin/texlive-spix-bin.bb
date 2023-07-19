SUMMARY = "Binary files of spix"
DESCRIPTION = "Binary files of spix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55933"

RPM_NAME = "texlive-spix-bin-2023.20230311.svn55933-93.1.aarch64.rpm"
RPM_HASH = "6e91e58766c78cd9f82b363a07f4d73d21ca367d3bdf530c655111f76224853df96e79e723db0cbed2b7b5931d006369aad0122948714e75918cd67a995e9684"

RPROVIDES:${PN} += "texlive-spix-bin"

RDEPENDS:${PN} += "texlive-spix"

inherit rpm
