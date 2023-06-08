SUMMARY = "A DVI Previewer"
DESCRIPTION = "Dvgt is a DVI previewer for console, terminals, and graphical terminals \
like Tektronics or the good old XTerm. dvgt tries to fit the conditions \
of the DVI files, therefore output on text terminals is not legible."
LICENSE = "SUSE-Public-Domain"

PV = "3.51L3"

RPM_NAME = "dvgt-3.51L3-1307.24.aarch64.rpm"
RPM_HASH = "12c59fdfc07a4974549b0c456e57653d6f055101245af70d53dcb2c5dfe7e436f666bba6bbb98862a74f76fcae4c9e78b7790399eecf1ccf8b4cbe07626b62d5"

RPROVIDES:${PN} += "dvgt dvgt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive"

inherit rpm
