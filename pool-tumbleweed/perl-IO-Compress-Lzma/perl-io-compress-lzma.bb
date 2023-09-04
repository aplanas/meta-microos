SUMMARY = "Write lzma files/buffers"
DESCRIPTION = "This module provides a Perl interface that allows writing lzma compressed \
data to files or buffer. \
 \
For reading lzma files/buffers, see the companion module \
IO::Uncompress::UnLzma."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.204"

RPM_NAME = "perl-IO-Compress-Lzma-2.204-1.1.noarch.rpm"
RPM_HASH = "760ca314a52cd77801a14ab89d714a0494eb2e5dff7e84163437c4eaa5973f72a0ffef79dd10c03116998097b03466419a7d9486cbd6517c18cab3571f4a9520"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Compress--Raw--Lzma \
perl-IO--Compress--Base \
perl-IO--Uncompress--Base"

inherit rpm
