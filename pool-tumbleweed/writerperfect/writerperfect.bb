SUMMARY = "Tools for converting WordPerfect documents"
DESCRIPTION = "Tools for converting WordPerfect and other documents to various other \
formats supported by the helper libraries that are also ie. used in \
libreoffice."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.9.6"

RPM_NAME = "writerperfect-0.9.6-2.7.aarch64.rpm"
RPM_HASH = "6fe0d209f97bfcaa4e5a07dfd8428ec640c2664414dff33b25121c8bbbff6b71aba80e8f3144a7c9e535d954ab75762fa13074546d141213ee513b563325e05e"

RPROVIDES:${PN} += "abw2abw \
abw2epub \
abw2odt \
cdr2epub \
cdr2odg \
cmx2epub \
cmx2odg \
ebook2abw \
ebook2epub \
ebook2odt \
fh2epub \
fh2odg \
key2epub \
key2odp \
mwaw2abw \
mwaw2epub \
mwaw2odf \
numbers2ods \
pages2abw \
pages2epub \
pages2odt \
pmd2epub \
pmd2odg \
pub2epub \
pub2odg \
qxp2epub \
qxp2odg \
sd2abw \
sd2epub \
sd2odf \
vsd2epub \
vsd2odg \
vss2epub \
vss2odg \
wks2ods \
wpd2abw \
wpd2epub \
wpd2odt \
wpft2abw \
wpft2epub \
wpft2odf \
wpg2epub \
wpg2odg \
wps2abw \
wps2epub \
wps2odt \
writerperfect \
zmf2epub \
zmf2odg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabw-0.1.so.1 \
libc.so.6 \
libcdr-0.1.so.1 \
libe-book-0.1.so.1 \
libeot.so.0 \
libepubgen-0.1.so.1 \
libetonyek-0.1.so.1 \
libfreehand-0.1.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libmspub-0.1.so.1 \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
libpagemaker-0.0.so.0 \
libqxp-0.0.so.0 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
librvngabw-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libvisio-0.1.so.1 \
libwpd-0.10.so.10 \
libwpg-0.3.so.3 \
libwps-0.4.so.4 \
libzmf-0.0.so.0"

inherit rpm
