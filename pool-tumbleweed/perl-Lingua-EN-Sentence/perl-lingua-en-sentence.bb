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

PV = "0.33"

RPM_NAME = "perl-Lingua-EN-Sentence-0.33-1.4.noarch.rpm"
RPM_HASH = "3b24116d4035a0f6b88db0f913da31c1911695b8d22e70513f79ae5d0357db2c4f35f3fd4696137f6636404e698bf3fa66612d8ac02463cbafc6b7d975b35ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Sentence \
perl-Lingua-EN-Sentence"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-warnings"

inherit rpm
