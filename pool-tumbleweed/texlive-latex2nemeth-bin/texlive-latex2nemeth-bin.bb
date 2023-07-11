SUMMARY = "Binary files of latex2nemeth"
DESCRIPTION = "Binary files of latex2nemeth"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42300"

RPM_NAME = "texlive-latex2nemeth-bin-2023.20230311.svn42300-92.1.aarch64.rpm"
RPM_HASH = "76adc326900f49fa58eabd0ddc18fb88e00589412e9e33439050e3503c1ff8553dec3b6584c0078893bd24c9358a1fdbd4c15a1d873d08febe1c8563bc79c3b4"

RPROVIDES:${PN} += "texlive-latex2nemeth-bin"

RDEPENDS:${PN} += "texlive-latex2nemeth"

inherit rpm
