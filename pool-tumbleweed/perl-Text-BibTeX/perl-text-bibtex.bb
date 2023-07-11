SUMMARY = "Interface to Read and Parse BibTeX Files"
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

PV = "0.88"

RPM_NAME = "perl-Text-BibTeX-0.88-1.22.aarch64.rpm"
RPM_HASH = "ece146ef0c2ef0e0a4dd6a9a766bfa9f2a4f6549d1ccf471505ce12edebbc21ec30e20af4fcebcbce37a5b9184d24aa37bfd859bc45613afce5614513e334597"

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
perl--MODULE-COMPAT-5.36.1 \
perl-Encode \
perl-Scalar--Util \
perl-Unicode--Normalize"

inherit rpm
