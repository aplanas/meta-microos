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

RPM_NAME = "perl-Text-BibTeX-0.88-1.21.aarch64.rpm"
RPM_HASH = "bbaef25a45662cc5cde878825fef0a73c3f020105e4cb66ee0b4230511b0d9490e4a080081a7c357ae16e79b3ba622f9f98a0dd815a9cceea1ead3d9a7aaf45f"

RPROVIDES:${PN} += "perl(Text::BibTeX) \
perl(Text::BibTeX::BibEntry) \
perl(Text::BibTeX::BibFormat) \
perl(Text::BibTeX::BibSort) \
perl(Text::BibTeX::BibStructure) \
perl(Text::BibTeX::Entry) \
perl(Text::BibTeX::File) \
perl(Text::BibTeX::Name) \
perl(Text::BibTeX::NameFormat) \
perl(Text::BibTeX::SimpleValue) \
perl(Text::BibTeX::Structure) \
perl(Text::BibTeX::StructuredEntry) \
perl(Text::BibTeX::Value) \
perl-Text-BibTeX \
perl-Text-BibTeX(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbtparse.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Encode) \
perl(Scalar::Util) \
perl(Unicode::Normalize)"

inherit rpm
