SUMMARY = "Development files for libudns"
DESCRIPTION = "UDNS is a stub DNS resolver library with ability to perform both \
synchronous and asynchronous DNS queries. \
 \
This package contains header files and documentation needed for writing \
or compiling programs that use UDNS."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "udns-devel-0.4-2.14.aarch64.rpm"
RPM_HASH = "25acd567d68ea256d8bc83ddf2c3e524fe860230aa3a2c8cf15a4316d17937d6eb58139ac4873c8279cb9709c7b0c40ea7321e972e149695f8918b79bddbc1b9"

RPROVIDES:${PN} += "udns-devel"

RDEPENDS:${PN} += "libudns0"

inherit rpm
