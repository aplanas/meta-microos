SUMMARY = "Static library for zlib"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage contains the static version of the library \
used for development."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "zlib-devel-static-1.2.13-4.2.aarch64.rpm"
RPM_HASH = "a353833b33ffa033446c4078184b341b407937fad43041d82ce55f83c63486b23ee781ae5006c7c33b5d14395410933b0cd98083391ed1fc243302411ab38434"

RPROVIDES:${PN} += "zlib-devel-/usr/lib64/libz.a \
zlib-devel-static"

RDEPENDS:${PN} += "zlib-devel"

inherit rpm
