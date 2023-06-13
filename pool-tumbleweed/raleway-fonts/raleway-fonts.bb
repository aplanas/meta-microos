SUMMARY = "Elegant sans-serif Typeface Family"
DESCRIPTION = "Raleway is an elegant sans-serif typeface, designed by Matt McInerney, \
initially in a single Thin weight. It is a display face that features \
both old style and lining numerals, standard and discretionary ligatures, \
a pretty complete set of diacritics, as well as stylistic alternates \
inspired by more geometric sans-serif typefaces than it's neo-grotesque \
inspired default character set. \
 \
The Impallari–Fuenzalida derivative extends the Raleway font family \
into a full set of 9 weights with true italics and expanded character \
set support for all 104 Latin languages."
LICENSE = "OFL-1.1"

PV = "3.0"

RPM_NAME = "raleway-fonts-3.0-4.17.noarch.rpm"
RPM_HASH = "d3cf7f9707d1499166c06941e7d62948358615c610f5ee777a1fe9966c3817fee62a831aab89a73afbe5160e698c9dc8885dd3db972e5dc0b2e16b8b6145cb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-raleway-fonts \
raleway-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
