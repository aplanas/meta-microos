SUMMARY = "Development files for jxrlib"
DESCRIPTION = "The jxrlib-devel package contains libraries and header files for \
developing applications that use jxrlib."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "jxrlib-devel-1.1-4.10.aarch64.rpm"
RPM_HASH = "3658d4bfed930ffcf21c9919ea21fd0e41f8de26455a8b7f7ce72b89e81bfb2e454c5c138d271f2ca92116c69af9b0c00a4ea5d8de060c59b79d673b37969f65"

RPROVIDES:${PN} += "jxrlib-devel"

RDEPENDS:${PN} += "libjpegxr0 \
libjxrglue0"

inherit rpm
