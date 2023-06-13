SUMMARY = "Low-Level Interface to lzma compression library"
DESCRIPTION = "'Compress::Raw::Lzma' provides an interface to the in-memory \
compression/uncompression functions from the lzma compression library. \
 \
Although the primary purpose for the existence of 'Compress::Raw::Lzma' is \
for use by the 'IO::Compress::Lzma', 'IO::Uncompress::UnLzma', \
'IO::Compress::Xz' and 'IO::Uncompress::UnXz' modules, it can be used on \
its own for simple compression/uncompression tasks. \
 \
There are two functions, called 'code' and 'flush', used in all the \
compression and uncompression interfaces defined in this module. By default \
both of these functions overwrites any data stored in its output buffer \
parameter. If you want to compress/uncompress to a single buffer, and have \
'code' and 'flush' append to that buffer, enable the 'AppendOutput' option \
when you create the compression/decompression object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.204"

RPM_NAME = "perl-Compress-Raw-Lzma-2.204-1.3.aarch64.rpm"
RPM_HASH = "2c5df772d908395ef39ea53e09fc3cc8bc12218029a14e7afb51a440bd205367b26d94d3bbc3a0a5297ea7ad8fb517d3871b8b9cd44d3a67b61e43e448924b9c"

RPROVIDES:${PN} += "perl(Compress::Raw::Lzma) \
perl-Compress-Raw-Lzma \
perl-Compress-Raw-Lzma(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblzma.so.5()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
