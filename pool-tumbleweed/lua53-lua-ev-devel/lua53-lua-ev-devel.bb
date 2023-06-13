SUMMARY = "Header files for lua53-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua53-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua53-lua-ev-devel-1.5-4.2.aarch64.rpm"
RPM_HASH = "d82e7307a0191cd2fb99730ad1fba13041bb48dd7a69f040f60a2b1abc3560ad15c0badabb03cc1417a75b8266540275acb71d2e5be925a120936b6710b7a3c8"

RPROVIDES:${PN} += "lua53-lua-ev-devel \
lua53-lua-ev-devel(aarch-64)"

RDEPENDS:${PN} += "lua53-lua-ev"

inherit rpm
