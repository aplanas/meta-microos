SUMMARY = "High-Quality Open Source Font Family"
DESCRIPTION = "Lato is a sanserif typeface family designed in the Summer 2010 by Warsaw-based \
designer Łukasz Dziedzic (“Lato” means “Summer” in Polish). In December 2010 \
the Lato family was published under the open-source Open Font License by his \
foundry tyPoland, with support from Google. \
 \
In 2013 – 2014, the family was greatly extended to cover 3000+ glyphs per style. \
The Lato 2.010 family now supports 100+ Latin-based languages, 50+ Cyrillic-based \
languages as well as Greek and IPA phonetics. In the process, the metrics and \
kerning of the family have been revised and four additional weights were created."
LICENSE = "OFL-1.1"

PV = "2.015"

RPM_NAME = "lato-fonts-2.015-1.4.noarch.rpm"
RPM_HASH = "d208410ed52fb0278a6e867eda24225cc82360db41a3a26b5c58ad27eb603b8a5085ffa5ba4cb3915c5589e8942f912576e942ecc140c93a70d18245c16e3dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-lato-fonts \
lato-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
