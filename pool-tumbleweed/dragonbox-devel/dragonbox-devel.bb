SUMMARY = "Header files for dragonbox, a float-to-string conversion library"
DESCRIPTION = "This library is a reference implementation of Dragonbox in C++. \
 \
Dragonbox is a float-to-string conversion algorithm based on a beautiful \
algorithm Schubfach, developed by Raffaello Giulietti in 2017-2018. \
Dragonbox is further inspired by Grisu and Grisu-Exact. \
 \
This package contains the headers."
LICENSE = "Apache-2.0 | BSL-1.0"

PV = "1.1.3"

RPM_NAME = "dragonbox-devel-1.1.3-3.1.aarch64.rpm"
RPM_HASH = "6ac9688551958586e316dd533fa6bf0eab87cfa0c082974567dc21f693cd4226c8412968d6dd225dc84529221eb7b227ed20df6f266239fd9717f80f9defc93f"

RPROVIDES:${PN} += "cmake-dragonbox \
dragonbox-devel"

RDEPENDS:${PN} += ""

inherit rpm
