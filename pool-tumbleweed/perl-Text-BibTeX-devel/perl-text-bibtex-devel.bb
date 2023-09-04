SUMMARY = "C library for parsing and processing BibTeX files"
DESCRIPTION = "The libbtparse is a C library for parsing and processing BibTeX files. \
Note that the interface provided by libbtparse, while complete, is fairly \
low-level.  If you have more sophisticated needs, you might be interested \
the 'Text::BibTeX' module for Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.890.0"

RPM_NAME = "perl-Text-BibTeX-devel-0.890.0-1.1.aarch64.rpm"
RPM_HASH = "e1e7c7975b5adac9bca33d7cc3a65eaa6fe60090c775232f24cea69dbd0768d9c1df3b25827c047214589b16dd41a5a198517df4c88e826d2cd258853e50e414"

RPROVIDES:${PN} += "libbtparse.so \
perl-Text-BibTeX-/usr/lib64/libbtparse.so \
perl-Text-BibTeX-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
