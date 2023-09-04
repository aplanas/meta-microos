SUMMARY = "Translator for converting texinfo documents to info format"
DESCRIPTION = "Makeinfo translates Texinfo source documentation to various other \
formats, by default Info files suitable for reading online with Emacs \
or standalone GNU Info."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "makeinfo-7.0.3-1.4.aarch64.rpm"
RPM_HASH = "390a61f85d488519dc629206a17facc8e3089725d95ecdb18470a8450a0ad1a32f6d115d612caacb13cb02682e8bdebb0bdaf320e097c96f55497343dfe6a4cf"

RPROVIDES:${PN} += "makeinfo \
texinfo-/usr/bin/makeinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl \
perl-Text--Unidecode"

inherit rpm
