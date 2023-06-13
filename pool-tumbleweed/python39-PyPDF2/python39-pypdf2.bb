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

RPM_NAME = "python39-PyPDF2-2.11.1-1.3.noarch.rpm"
RPM_HASH = "57c0a86636d81fe00d74211d74e91971f524fd53d08c2b90188db54214784aa582b2d0dd94ca8e1cdf50ee1ec579e1b7f7ff7c90cd77d49779f44e4e56de6803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypdf2) \
python39-PyPDF2 \
python3dist(pypdf2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
