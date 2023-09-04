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

RPM_NAME = "perl-Sort-Key-1.33-1.34.aarch64.rpm"
RPM_HASH = "3d7457cee12c00f92119254e9cd55aea463fb1de6c3df981f03ed2423c9f3accc8cbebbe6a2b99f874cb8ae8c62bbde2f3eeffffc110040cdab6138342851426"

RPROVIDES:${PN} += "perl-Sort--Key \
perl-Sort--Key--Maker \
perl-Sort--Key--Multi \
perl-Sort--Key--Natural \
perl-Sort--Key--Register \
perl-Sort--Key--Types \
perl-Sort-Key"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
