SUMMARY = "CBLAS - static libraries"
DESCRIPTION = "The cblas-devel-static package contains the CBLAS static libraries \
for -static linking. You do not need these, unless you link \
statically, which is highly discouraged."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "cblas-devel-static-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "bcadd17a5eb59b86e296caef42960c139d1f036558a58586678ccc92476dfd22dacb797063d097d44ee825574447979c37a0daf33cd4a7f0398836d1a77e76e4"

RPROVIDES:${PN} += "cblas-devel-static"

RDEPENDS:${PN} += "cblas-devel"

inherit rpm
