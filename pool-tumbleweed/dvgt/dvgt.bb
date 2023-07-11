SUMMARY = "A DVI Previewer"
DESCRIPTION = "Dvgt is a DVI previewer for console, terminals, and graphical terminals \
like Tektronics or the good old XTerm. dvgt tries to fit the conditions \
of the DVI files, therefore output on text terminals is not legible."
LICENSE = "SUSE-Public-Domain"

PV = "3.51L3"

RPM_NAME = "dvgt-3.51L3-1307.25.aarch64.rpm"
RPM_HASH = "e0ce2f38c46fa6a7ca65267ee079c86ea01e3472de8217169ade6c3241d10073274c403740e2cb0c7ede146d0a0f69375221f5cb437658e381570b0b28d8c75c"

RPROVIDES:${PN} += "dvgt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive"

inherit rpm
