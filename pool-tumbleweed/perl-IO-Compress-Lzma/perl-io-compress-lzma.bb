SUMMARY = "Write lzma files/buffers"
DESCRIPTION = "This module provides a Perl interface that allows writing lzma compressed \
data to files or buffer. \
 \
For reading lzma files/buffers, see the companion module \
IO::Uncompress::UnLzma."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.093"

RPM_NAME = "perl-IO-Compress-Lzma-2.093-1.11.noarch.rpm"
RPM_HASH = "b6d2f6713225dc3652a9e9ed9ae278647061fce439285a4cd99cadf09a2c9fee5a691be7d9ba4e1e6cc6361c79c8432217c07647f99f771ed929e897e98dcf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Compress::Adapter::Lzip) \
perl(IO::Compress::Adapter::Lzma) \
perl(IO::Compress::Adapter::Xz) \
perl(IO::Compress::Lzip) \
perl(IO::Compress::Lzma) \
perl(IO::Compress::Xz) \
perl(IO::Uncompress::Adapter::UnLzip) \
perl(IO::Uncompress::Adapter::UnLzma) \
perl(IO::Uncompress::Adapter::UnXz) \
perl(IO::Uncompress::UnLzip) \
perl(IO::Uncompress::UnLzma) \
perl(IO::Uncompress::UnXz) \
perl-IO-Compress-Lzma"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Compress::Raw::Lzma) \
perl(IO::Compress::Base) \
perl(IO::Uncompress::Base)"

inherit rpm
