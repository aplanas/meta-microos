SUMMARY = "Header files for lua54-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua54-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua54-luasocket-devel-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "9dbeb4a3889b786edfc71cf17357b414e5b7270ebd957e71e96f4699c4522af142506d376da481fd52801581e7a72c9214083a7f6cfc7af9e6294a942320b1d6"

RPROVIDES:${PN} += "lua54-luasocket-devel"

RDEPENDS:${PN} += "lua54-luasocket"

inherit rpm
