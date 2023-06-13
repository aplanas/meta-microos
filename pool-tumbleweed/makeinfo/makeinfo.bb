SUMMARY = "Translator for converting texinfo documents to info format"
DESCRIPTION = "Makeinfo translates Texinfo source documentation to various other \
formats, by default Info files suitable for reading online with Emacs \
or standalone GNU Info."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "makeinfo-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "a592e2b9a5bbd781cd7940c38d69d9ded88c2ed77a5410e15b425f14c5f52d1cb1d3eb3a1e6289d25e56e9f54c29d0220a989553b14a7d5f839963508154296c"

RPROVIDES:${PN} += "makeinfo \
makeinfo(aarch-64) \
texinfo:/usr/bin/makeinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl \
perl(Text::Unidecode)"

inherit rpm
