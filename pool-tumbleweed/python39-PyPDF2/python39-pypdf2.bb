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

RPM_NAME = "python39-PyPDF2-2.11.1-1.4.noarch.rpm"
RPM_HASH = "f203efa1e5000067d3cb7e920315d1ae5f78b887ba03ddf2593f95d4e34aa937f0591809ab49a086d79c69078c7cbd5c4519b70a306673cd80b5ff66d41477c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypdf2 \
python39-PyPDF2 \
python3dist-pypdf2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
