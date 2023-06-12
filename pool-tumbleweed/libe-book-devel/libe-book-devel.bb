SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-devel-0.1.3-2.21.aarch64.rpm"
RPM_HASH = "a493405c097b4e75a03c3beea2adc90a74905587383ac7007f29ffe81c09a7b4aba000649557b73fe42fcdc85908a1982f3fd73169c3f9b1ae50832685fffbdf"

RPROVIDES:${PN} += "libe-book-devel \
libe-book-devel(aarch-64) \
pkgconfig(libe-book-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libe-book-0_1-1 \
libstdc++-devel \
pkgconfig(icu-uc) \
pkgconfig(liblangtag) \
pkgconfig(librevenge-0.0) \
pkgconfig(libxml-2.0) \
pkgconfig(zlib)"

inherit rpm
