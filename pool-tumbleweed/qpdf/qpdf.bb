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

PV = "11.3.0"

RPM_NAME = "qpdf-11.3.0-1.3.aarch64.rpm"
RPM_HASH = "8756f8f21a4fe3764977c8b97c70a0eb08bbbed2382fa5c8042e88ac89de883665d8c1cbd80638c69678f04af02feae692bb867e2c5e615826d1e6d84f50d058"

RPROVIDES:${PN} += "qpdf \
qpdf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libqpdf.so.29()(64bit) \
libqpdf.so.29(LIBQPDF_29)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
