SUMMARY = "Development files for libftxf"
DESCRIPTION = "libftxf is a library for Transactional NTFS (TxF) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libftxf."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libftxf-devel-20220116-3.2.aarch64.rpm"
RPM_HASH = "263b8c55bc84cabf7691745149398a71647c8e930bca0423cd412b16623129015f878ebfc2c2023ab7b571fcbde76362461efcceb774eadafde3bd09545cdb63"

RPROVIDES:${PN} += "libftxf-devel \
libftxf-devel(aarch-64) \
pkgconfig(libftxf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxf1"

inherit rpm
