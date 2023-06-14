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

RPM_NAME = "zlib-devel-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "508421172c7b98086e8088e02476b1dc081a82c09997698336ce633c78024e98d87a352d737e037410c71e0cbd432f97f4744bf70e86e2b37fe0413fc549a4a1"

RPROVIDES:${PN} += "pkgconfig-zlib \
zlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libz1"

inherit rpm
