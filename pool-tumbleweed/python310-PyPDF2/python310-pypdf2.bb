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

RPM_NAME = "python310-PyPDF2-2.11.1-1.4.noarch.rpm"
RPM_HASH = "b55f6dedf1e4be033bedf1115bd7728c3ca791995d91e316a92627648e1ad69ab98060c9bcfbb0bbee34094738fc87caf4afe5027c189da008e1af6560f74fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypdf2 \
python310-PyPDF2 \
python3dist-pypdf2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
