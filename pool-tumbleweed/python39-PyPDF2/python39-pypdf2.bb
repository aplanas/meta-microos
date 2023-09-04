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

RPM_NAME = "python39-PyPDF2-2.11.1-2.1.noarch.rpm"
RPM_HASH = "c0bcec03c24daa9bf3f2b3e21d4ba3a1894071e317f424330438b925b2764b64cdfe5ac73011a3ff5e63439cd57cba373c8d01381ed625b209c8aba97169ceac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypdf2 \
python39-PyPDF2 \
python3dist-pypdf2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
