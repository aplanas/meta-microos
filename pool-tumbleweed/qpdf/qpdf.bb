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

PV = "11.5.0"

RPM_NAME = "qpdf-11.5.0-1.1.aarch64.rpm"
RPM_HASH = "1545bb97c89b9852d292db7e7045793b263404ad0d40331384def3d13b7f785174436ccacd21dbb7619f4a0dad92786c387825d18472780b86ba26528203e5f2"

RPROVIDES:${PN} += "qpdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpdf.so.29 \
libstdc++.so.6"

inherit rpm
