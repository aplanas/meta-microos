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
writerperfect(aarch-64) \
zmf2epub \
zmf2odg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libabw-0.1.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdr-0.1.so.1()(64bit) \
libe-book-0.1.so.1()(64bit) \
libeot.so.0()(64bit) \
libepubgen-0.1.so.1()(64bit) \
libetonyek-0.1.so.1()(64bit) \
libfreehand-0.1.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit) \
libmspub-0.1.so.1()(64bit) \
libmwaw-0.3.so.3()(64bit) \
libodfgen-0.1.so.1()(64bit) \
libpagemaker-0.0.so.0()(64bit) \
libqxp-0.0.so.0()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
librvngabw-0.0.so.0()(64bit) \
libstaroffice-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvisio-0.1.so.1()(64bit) \
libwpd-0.10.so.10()(64bit) \
libwpg-0.3.so.3()(64bit) \
libwps-0.4.so.4()(64bit) \
libzmf-0.0.so.0()(64bit)"

inherit rpm
