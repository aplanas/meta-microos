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

RPM_NAME = "python310-PyPDF2-2.11.1-2.1.noarch.rpm"
RPM_HASH = "57fd36b8e233a15712d2198e2569fcce7b2948afcfcffb77fa413ba7e26c20c4ad0ca59e94d27938b1341335e3b77e2cce490906d734f3c1d9bec10b46637eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypdf2 \
python310-PyPDF2 \
python3dist-pypdf2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
