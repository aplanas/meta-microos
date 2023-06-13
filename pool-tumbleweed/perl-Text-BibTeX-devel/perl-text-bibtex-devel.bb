SUMMARY = "C library for parsing and processing BibTeX files"
DESCRIPTION = "The libbtparse is a C library for parsing and processing BibTeX files. \
Note that the interface provided by libbtparse, while complete, is fairly \
low-level.  If you have more sophisticated needs, you might be interested \
the 'Text::BibTeX' module for Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-Text-BibTeX-devel-0.88-1.21.aarch64.rpm"
RPM_HASH = "e41660072482c1fdafdc6b3a1bc8b2520159d7ea9bd941afc161f0136d94a944e2786ac45d95aa5b7f5ab0ad89cb7f3f38aa689aa593d749d8b8d78cccdcbaa2"

RPROVIDES:${PN} += "libbtparse.so()(64bit) \
perl-Text-BibTeX-devel \
perl-Text-BibTeX-devel(aarch-64) \
perl-Text-BibTeX:/usr/lib64/libbtparse.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
