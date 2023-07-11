SUMMARY = "Development files for nauty, a math library"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs. They can also produce a canonical label. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libnauty."
LICENSE = "Apache-2.0"

PV = "2.8.6"

RPM_NAME = "nauty-devel-2.8.6-1.4.aarch64.rpm"
RPM_HASH = "d67372a45d4957c2ea9730be449a86c7d9aa028c119a34498b7430addfdf2340893fc26b482597293f4cef7f150ffef02e29b482d862907761762b607481e356"

RPROVIDES:${PN} += "nauty-devel"

RDEPENDS:${PN} += "libnauty-2-8-6"

inherit rpm
