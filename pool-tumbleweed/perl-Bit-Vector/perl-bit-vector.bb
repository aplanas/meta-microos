SUMMARY = "Bit::Vector Perl module"
DESCRIPTION = "Bit::Vector Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "7.4"

RPM_NAME = "perl-Bit-Vector-7.4-1.39.aarch64.rpm"
RPM_HASH = "cea03062fc6074df209414adbe59fdd7b9ee83f0cd6dd79aeb7b93bc1ab8cb4e00b0fd576b5c157653b76abfb73d1101b0fd87c288ac7a3bbddb533d614450f0"

RPROVIDES:${PN} += "perl-Bit--Vector \
perl-Bit--Vector--Overload \
perl-Bit--Vector--String \
perl-Bit-Vector"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Carp--Clan \
perl-Storable"

inherit rpm
