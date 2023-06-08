SUMMARY = "Virtual PDF printer for CUPS"
DESCRIPTION = "CUPS-PDF is a PDF writer backend for CUPS. \
It provides a virtual CUPS-PDF printer which produces PDF files \
so that application programs which have no built-in support \
to 'Save as PDF' could print to CUPS-PDF to get a PDF file. \
For details see /usr/share/doc/packages/cups-pdf/README \
and http://en.opensuse.org/SDB:Printing_to_PDF"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "cups-pdf-3.0.1-2.7.aarch64.rpm"
RPM_HASH = "27311558a0288599d310e0fcb0c36a5b31af0e134c6b93c73176849678c0f6daca7c26e6c99e2fca1b784c4ba9e4189e916f510a55f66020fce7842dc1b1da42"

RPROVIDES:${PN} += "config(cups-pdf) cups-pdf cups-pdf(aarch-64) postscriptdriver(generic;cups-pdf_printer;)"
RDEPENDS:${PN} += "/bin/sh cups-client ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcups.so.2()(64bit)"

inherit rpm
