SUMMARY = "Header files for lua51-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua51-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua51-lua-ev-devel-1.5-4.3.aarch64.rpm"
RPM_HASH = "9e20bc09b84b37398e85fe37eaeb69c3b69e3373a5aa8d8f587d5a9c2ee46f5ae6ef2c288e5eed2d6dba1ce50be7cd9bb834edbfdeb20281580f5ceea069d2c7"

RPROVIDES:${PN} += "lua51-lua-ev-devel"

RDEPENDS:${PN} += "lua51-lua-ev"

inherit rpm
