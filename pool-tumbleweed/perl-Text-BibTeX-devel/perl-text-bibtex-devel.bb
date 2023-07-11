SUMMARY = "C library for parsing and processing BibTeX files"
DESCRIPTION = "The libbtparse is a C library for parsing and processing BibTeX files. \
Note that the interface provided by libbtparse, while complete, is fairly \
low-level.  If you have more sophisticated needs, you might be interested \
the 'Text::BibTeX' module for Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-Text-BibTeX-devel-0.88-1.22.aarch64.rpm"
RPM_HASH = "1eb6c5a0e9f3771f9dcba97d067f1f429ae81c75781eadbf3ac5a81ae461fa90c41d99957907caf7d72a7e0d363d32b25ab1761a8d5b8fa8e9803a2a8748bfcc"

RPROVIDES:${PN} += "libbtparse.so \
perl-Text-BibTeX-/usr/lib64/libbtparse.so \
perl-Text-BibTeX-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
