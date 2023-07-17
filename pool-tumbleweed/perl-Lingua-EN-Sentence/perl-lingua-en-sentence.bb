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

RPM_NAME = "perl-Lingua-EN-Sentence-0.34-1.1.noarch.rpm"
RPM_HASH = "b430c0c5915b76a0ff889153823ca7da1b01551f6ab9972e1394d413a858e87dbbdd72b4c88ddedd87649f94989ec5af4e7aaf79128c6a85abb36a58b5766eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Sentence \
perl-Lingua-EN-Sentence"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-warnings"

inherit rpm
