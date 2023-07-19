SUMMARY = "Binary files of patgen"
DESCRIPTION = "Binary files of patgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-patgen-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "bdd78f0d5cc72ca0909fedfdfa0c2ed8f955d86faffad6a45d77be4249225991192a30076202e5f55e920a29665d879f02731089316c78f581a1c782c4cd7be2"

RPROVIDES:${PN} += "texlive-patgen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-patgen"

inherit rpm
