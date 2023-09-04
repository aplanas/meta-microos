SUMMARY = "Binary files of xml2pmx"
DESCRIPTION = "Binary files of xml2pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xml2pmx-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "f36ce9147aa47b627ba666f88778e3cfe2b4ac659744aa065101ead7783ad2d17988cb14bf706480059c9e31341d8b4c407fca4e0af40d5ded80e9c4618b4135"

RPROVIDES:${PN} += "texlive-xml2pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-xml2pmx"

inherit rpm
