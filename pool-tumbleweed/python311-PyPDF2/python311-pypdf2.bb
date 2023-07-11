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

RPM_NAME = "python311-PyPDF2-2.11.1-1.4.noarch.rpm"
RPM_HASH = "1cd54befa53d4bb85001ac71f4f6820680e188c85bb83e8d5a0b54f3949c931d48a8fa9077c0cd4b236ec1858c2d0cad9140bfb0a0ec668c1eb4eacfac9fb856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF2 \
python3.11dist-pypdf2 \
python311-PyPDF2 \
python3dist-pypdf2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
