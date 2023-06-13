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

RPM_NAME = "python310-PyPDF2-2.11.1-1.3.noarch.rpm"
RPM_HASH = "5f8c2a792e6b2f4be829097ae80ea8ad854cbc86fab0542622a0bdcf015b65f1d94c0a3d4934f22a40708f8e82a112c8a6d2b46af6c2c5149e255595334f9432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF2 \
python3.10dist(pypdf2) \
python310-PyPDF2 \
python3dist(pypdf2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
