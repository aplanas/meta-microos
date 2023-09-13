SUMMARY = "Command-line tools and library for transforming PDF files"
DESCRIPTION = "QPDF is a program that does structural, content-preserving \
transformations on PDF files.  It could have been called something \
like pdf-to-pdf.  It also provides many useful capabilities to \
developers of PDF-producing software or for people who just want to \
look at the innards of a PDF file to learn more about how they work. \
 \
QPDF offers many capabilities such as linearization (web \
optimization), encrypt, and decryption of PDF files.  Note that QPDF \
does not have the capability to create PDF files from scratch; it is \
only used to create PDF files with special characteristics starting \
from other PDF files or to inspect or extract information from \
existing PDF files."
LICENSE = "Apache-2.0"

PV = "11.6.0"

RPM_NAME = "qpdf-11.6.0-1.1.aarch64.rpm"
RPM_HASH = "952a9626fd5f4df6eb878887dc5f3502e3a7c8526780762baf6d61759c20e32aa35a0d848e27608c49c748a1b6db26b4954c8ffae07a01bfb64f39155fcabf15"

RPROVIDES:${PN} += "qpdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpdf.so.29 \
libstdc++.so.6"

inherit rpm
