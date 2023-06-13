SUMMARY = "Geometric sans serif typefaces"
DESCRIPTION = "Geometric sans serif typefaces have been a popular design tool ever since these actors took to the world’s stage. Poppins is one of the new comers to this long tradition. With support for the Devanagari and Latin writing systems, it is an internationalist take on the genre. \
 \
Many of the Latin glyphs (such as the ampersand) are more constructed and rationalist than is typical. The Devanagari design is particularly new, and is the first ever Devanagari typeface with a range of weights in this genre. Just like the Latin, the Devanagari is based on pure geometry, particularly circles. \
 \
Each letterform is nearly monolinear, with optical corrections applied to stroke joints where necessary to maintain an even typographic color. The Devanagari base character height and the Latin ascender height are equal; Latin capital letters are shorter than the Devanagari characters, and the Latin x-height is set rather high. \
 \
The Devanagari is designed by Ninad Kale. The Latin is by Jonny Pinhorn."
LICENSE = "OFL-1.1"

PV = "4.003"

RPM_NAME = "google-poppins-fonts-4.003-1.7.noarch.rpm"
RPM_HASH = "5e872b7bf69f590a6119d06bce20dbc41dd3e6303b0396ee41041bc747bbb3728bf7042e5707b4475ef89114c98a1100628d8c84db4813cfa4e1a852b4819e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-poppins-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
perl"

inherit rpm
