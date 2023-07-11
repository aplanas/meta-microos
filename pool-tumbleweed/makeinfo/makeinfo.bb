SUMMARY = "Translator for converting texinfo documents to info format"
DESCRIPTION = "Makeinfo translates Texinfo source documentation to various other \
formats, by default Info files suitable for reading online with Emacs \
or standalone GNU Info."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "makeinfo-7.0.3-1.3.aarch64.rpm"
RPM_HASH = "c38cf6add911ba930489f02304d9b55d3e2eabc9561a0e1495dd80171f950705934b8d3e4af590e19ca0b1116be7ae7347523925cf0ddf74d6fc7a2975f7d61b"

RPROVIDES:${PN} += "makeinfo \
texinfo-/usr/bin/makeinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl \
perl-Text--Unidecode"

inherit rpm
