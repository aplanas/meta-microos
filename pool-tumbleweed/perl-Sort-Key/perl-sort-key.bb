SUMMARY = "the fastest way to sort anything in Perl"
DESCRIPTION = "Sort::Key provides a set of functions to sort lists of values by some \
calculated key value. \
 \
It is faster (usually *much faster*) and uses less memory than other \
alternatives implemented around perl sort function (ST, GRT, etc.). \
 \
Multi-key sorting functionality is also provided via the companion modules \
the Sort::Key::Multi manpage, the Sort::Key::Maker manpage and the \
Sort::Key::Register manpage."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.33"

RPM_NAME = "perl-Sort-Key-1.33-1.33.aarch64.rpm"
RPM_HASH = "038b98fa55740bfaa1f69678ffef4a847ac276fb6d1a35f63773fff9977f4237202ab853c2c2f5ca80ed52f6d3fdd0494d0f4013b58f836107af074f3b732314"

RPROVIDES:${PN} += "perl-Sort--Key \
perl-Sort--Key--Maker \
perl-Sort--Key--Multi \
perl-Sort--Key--Natural \
perl-Sort--Key--Register \
perl-Sort--Key--Types \
perl-Sort-Key"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
