SUMMARY = "PDF toolkit"
DESCRIPTION = "A Pure-Python library built as a PDF toolkit.  It is capable of: \
 \
- extracting document information (title, author, ...), \
- splitting documents page by page, \
- merging documents page by page, \
- cropping pages, \
- merging multiple pages into a single page, \
- encrypting and decrypting PDF files. \
 \
By being Pure-Python, it should run on any Python platform without any \
dependencies on external libraries.  It can also work entirely on StringIO \
objects rather than file streams, allowing for PDF manipulation in memory. \
It is therefore a useful tool for websites that manage or manipulate PDFs."
LICENSE = "BSD-3-Clause"

PV = "2.11.1"

RPM_NAME = "python311-PyPDF2-2.11.1-2.1.noarch.rpm"
RPM_HASH = "c7d0415371c7fa3f71bbaddb3ca09644ffc31a62e63dcdeaba3e64320c5af1272d4880fb8d766d1f9ced0462f8778d70cc2243766db96085495c0f34b37187aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF2 \
python3.11dist-pypdf2 \
python311-PyPDF2 \
python3dist-pypdf2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
