SUMMARY = "Development files for libsz2"
DESCRIPTION = "Header files for libsz2, a drop-in replacement for the \
SZIP library (http://www.hdfgroup.org/doc_resource/SZIP)."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "sz2-devel-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "2d180c07792670dda54469ea57d133a9c48be45b24927624a71b76429279fad906d9f74e0646808f08a3fa998215be5f50fc90cbe2048f7425daf07a67d30a28"

RPROVIDES:${PN} += "libsz2-devel \
sz2-devel"

RDEPENDS:${PN} += "libaec-devel \
libsz2"

inherit rpm
