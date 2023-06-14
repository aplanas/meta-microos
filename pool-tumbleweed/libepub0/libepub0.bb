SUMMARY = "A library for reading ebook files"
DESCRIPTION = "libepub library is needed for okular to support ebook format."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "libepub0-0.2.2-7.1.aarch64.rpm"
RPM_HASH = "c6bb35f9657737309ca444a4290577c9b360bcaef9624a3265e73575bbeabe28ce5563e80d44a7c5173663cbe84ed9dcfbb1d5e402dc011f90bcf9fa4d66719e"

RPROVIDES:${PN} += "libepub.so.0 \
libepub0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libzip.so.5"

inherit rpm
