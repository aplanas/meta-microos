SUMMARY = "Header files for lua53-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua53-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua53-luasocket-devel-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "fb636b07a24b2d3299e956ab5d12ca7f68f24bdeee94e24960f54e28abf1f19703008d6e29ed47bcb241e3e1f44e2b5e89ac7be4c04feeae411b5a08cf1ec788"

RPROVIDES:${PN} += "lua53-luasocket-devel"

RDEPENDS:${PN} += "lua53-luasocket"

inherit rpm
