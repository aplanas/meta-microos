SUMMARY = "Split text into sentences"
DESCRIPTION = "The 'Lingua::EN::Sentence' module contains the function get_sentences, \
which splits text into its constituent sentences, based on a regular \
expression and a list of abbreviations (built in and given). \
 \
Certain well know exceptions, such as abbreviations, may cause incorrect \
segmentations. But some of them are already integrated into this code and \
are being taken care of. Still, if you see that there are words causing the \
get_sentences function to fail, you can add those to the module, so it \
notices them. Note that abbreviations are case sensitive, so 'Mrs.' is \
recognised but not 'mrs.'"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-Lingua-EN-Sentence-0.34-1.2.noarch.rpm"
RPM_HASH = "1db7a82527e5471a28923e363cd4c9e63cc060f7a6a4601f8ae077dba79c60973426f4e72621f0ebfb74a67574ef0e916613495a5a30c9ed0babf969e69099b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Sentence \
perl-Lingua-EN-Sentence"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-warnings"

inherit rpm
