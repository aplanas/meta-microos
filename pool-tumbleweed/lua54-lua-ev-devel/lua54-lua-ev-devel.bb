SUMMARY = "Header files for lua54-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua54-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua54-lua-ev-devel-1.5-4.2.aarch64.rpm"
RPM_HASH = "412e3db14d739bddc04e3b602499d554f62e7e01c5510b26085ae919340a817f01175abe4622fd625a98e34925970f84e66efa1d4c7003f0412b3d92d8086044"

RPROVIDES:${PN} += "lua54-lua-ev-devel \
lua54-lua-ev-devel(aarch-64)"

RDEPENDS:${PN} += "lua54-lua-ev"

inherit rpm
