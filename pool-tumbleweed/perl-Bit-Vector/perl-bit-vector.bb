SUMMARY = "Bit::Vector Perl module"
DESCRIPTION = "Bit::Vector Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "7.4"

RPM_NAME = "perl-Bit-Vector-7.4-1.40.aarch64.rpm"
RPM_HASH = "7b0b461fc33b70d988670265c3e4f80ae2c87ccd6f2c8ada13644d46b112f6914b8a77ace9acdf5e4f799a6b2e5bbf3b0ba7fb9e226e382e526638c54d1ac919"

RPROVIDES:${PN} += "perl-Bit--Vector \
perl-Bit--Vector--Overload \
perl-Bit--Vector--String \
perl-Bit-Vector"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Clan \
perl-Storable"

inherit rpm
