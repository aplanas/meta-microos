SUMMARY = "Write lzma files/buffers"
DESCRIPTION = "This module provides a Perl interface that allows writing lzma compressed \
data to files or buffer. \
 \
For reading lzma files/buffers, see the companion module \
IO::Uncompress::UnLzma."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.093"

RPM_NAME = "perl-IO-Compress-Lzma-2.093-1.12.noarch.rpm"
RPM_HASH = "c35355d33f0ab6da0e3060eb0c28c11ae3e5b6073336faf607d9076b83cc1003fdeb0d7afe2f2f812759bb2e88e478d8bc3a72088faebf3920ec67d273a86ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Compress--Adapter--Lzip \
perl-IO--Compress--Adapter--Lzma \
perl-IO--Compress--Adapter--Xz \
perl-IO--Compress--Lzip \
perl-IO--Compress--Lzma \
perl-IO--Compress--Xz \
perl-IO--Uncompress--Adapter--UnLzip \
perl-IO--Uncompress--Adapter--UnLzma \
perl-IO--Uncompress--Adapter--UnXz \
perl-IO--Uncompress--UnLzip \
perl-IO--Uncompress--UnLzma \
perl-IO--Uncompress--UnXz \
perl-IO-Compress-Lzma"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Compress--Raw--Lzma \
perl-IO--Compress--Base \
perl-IO--Uncompress--Base"

inherit rpm
