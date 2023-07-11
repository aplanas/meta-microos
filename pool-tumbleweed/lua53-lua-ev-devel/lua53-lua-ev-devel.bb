SUMMARY = "Header files for lua53-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua53-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua53-lua-ev-devel-1.5-4.3.aarch64.rpm"
RPM_HASH = "74f3697464eab6280db1663b5f60efa145e5dad4461e061e889bc634f5f17bb422a022c13a2520cccf2070fd82d32dfa80859370510e98b146e23b89f4c4bcaf"

RPROVIDES:${PN} += "lua53-lua-ev-devel"

RDEPENDS:${PN} += "lua53-lua-ev"

inherit rpm
