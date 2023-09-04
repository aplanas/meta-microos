SUMMARY = "Interface to read and parse BibTeX files"
DESCRIPTION = "The 'Text::BibTeX' module serves mainly as a high-level introduction to the \
'Text::BibTeX' library, for both code and documentation purposes. The code \
loads the two fundamental modules for processing BibTeX files \
('Text::BibTeX::File' and 'Text::BibTeX::Entry'), and this documentation \
gives a broad overview of the whole library that isn't available in the \
documentation for the individual modules that comprise it. \
 \
In addition, the 'Text::BibTeX' module provides a number of miscellaneous \
functions that are useful in processing BibTeX data (especially the kind \
that comes from bibliographies as defined by BibTeX 0.99, rather than \
generic database files). These functions don't generally fit in the \
object-oriented class hierarchy centred around the 'Text::BibTeX::Entry' \
class, mainly because they are specific to bibliographic data and operate \
on generic strings (rather than being tied to a particular BibTeX entry). \
These are also documented here, in 'MISCELLANEOUS FUNCTIONS'. \
 \
Note that every module described here begins with the 'Text::BibTeX' \
prefix. For brevity, I have dropped this prefix from most class and module \
names in the rest of this manual page (and in most of the other manual \
pages in the library)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.890.0"

RPM_NAME = "perl-Text-BibTeX-0.890.0-1.1.aarch64.rpm"
RPM_HASH = "afc963e93be8d2384aa25db052fd9b1ea4239d3a2f22e6ed01a2ad8729434d4b7684624dcfdda78db6a5a81e9a942745fdbba9fcf89952d77aee61930ccabe56"

RPROVIDES:${PN} += "perl-Text--BibTeX \
perl-Text--BibTeX--BibEntry \
perl-Text--BibTeX--BibFormat \
perl-Text--BibTeX--BibSort \
perl-Text--BibTeX--BibStructure \
perl-Text--BibTeX--Entry \
perl-Text--BibTeX--File \
perl-Text--BibTeX--Name \
perl-Text--BibTeX--NameFormat \
perl-Text--BibTeX--SimpleValue \
perl-Text--BibTeX--Structure \
perl-Text--BibTeX--StructuredEntry \
perl-Text--BibTeX--Value \
perl-Text-BibTeX"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbtparse.so \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Scalar--Util"

inherit rpm
