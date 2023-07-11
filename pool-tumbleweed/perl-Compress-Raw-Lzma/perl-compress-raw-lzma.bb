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

RPM_NAME = "perl-Compress-Raw-Lzma-2.204-1.4.aarch64.rpm"
RPM_HASH = "57d921a94d4542a2bed3c4c87136cea810f3d1d97ec97afff8bdb0888230e6130e1bab95684a64b6a7cccfb706fb74428634e909633962030baa6873552a3e37"

RPROVIDES:${PN} += "perl-Compress--Raw--Lzma \
perl-Compress-Raw-Lzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
