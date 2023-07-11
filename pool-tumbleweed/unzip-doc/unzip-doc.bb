SUMMARY = "Documentation files for unzip"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-doc-6.00-41.4.noarch.rpm"
RPM_HASH = "18091593b003a85d895384809d5a7992cc9f949959a3f2bd98e89e489e7a150f3d70b61f4601cbf580b66714d058265915a8d0c8761a6c0ac33b04f2827aa3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unzip-doc"

RDEPENDS:${PN} += ""

inherit rpm
