SUMMARY = "Development files for zlib, a data compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library. \
 \
The zlib data format is itself portable across platforms. Unlike the \
LZW compression method used in unix compress(1) and in the GIF image \
format, the compression method currently used in zlib essentially \
never expands the data. (LZW can double or triple the file size in \
extreme cases.) zlib's memory footprint is also independent of the \
input data and can be reduced, if necessary, at some cost in \
compression."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "zlib-devel-1.2.13-4.2.aarch64.rpm"
RPM_HASH = "baa1c3acfd16896404321e2dc284569e890aa1188cafaa7719c98c0e721ee4d481594efa9fc68fd77b358a48c7c88ef9e465e5f6f870d62a4dea64dc153ea82d"

RPROVIDES:${PN} += "pkgconfig-zlib \
zlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libz1"

inherit rpm
